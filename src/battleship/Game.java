package battleship;

import java.util.Scanner;

public class Game {

    Scanner scanner;
    GameBoard player1;
    GameBoard player2;

    public Game(Scanner scanner) {
        this.scanner = scanner;
        player1 = new GameBoard();
        player2 = new GameBoard();
    }


    public void placesShips(GameBoard currentPlayer) {

        Ship[] ships = {
                new Ship("Aircraft Carrier", 5),
                new Ship("Battleship", 4),
                new Ship("Submarine", 3),
                new Ship("Cruiser", 3),
                new Ship("Destroyer", 2)
        };


        for (int i = 0; i < ships.length; i++) {

            boolean shipPlaced = false;
            while (!shipPlaced) {

                System.out.println("Enter the coordinates of the " + ships[i].getName() +
                        " (" + ships[i].getSize() + " cells):");
                System.out.println();

                String beginning = scanner.next();
                String end = scanner.next();

                int [] beginningCoordinates = coordinates(beginning);
                int [] endCoordinates = coordinates(end);

                if (beginningCoordinates != null && endCoordinates != null) {

                    int beginningY = beginningCoordinates[0];
                    int beginningX = beginningCoordinates[1];
                    int endY = endCoordinates[0];
                    int endX = endCoordinates[1];
                    shipPlaced = currentPlayer.addShip(ships[i], beginningY, beginningX, endY, endX);

                }
            }
            currentPlayer.display(false);
            System.out.println();

        }
    }

    public boolean shoot(GameBoard enemyPlayer) {

        boolean shootTaken = false;
        while (!shootTaken) {

            System.out.println();
            String shoot = scanner.next();

            int [] shootCoordinates = coordinates(shoot);

            if (shootCoordinates != null) {

                int shootY = shootCoordinates[0];
                int shootX = shootCoordinates[1];
                int hitOrMiss = enemyPlayer.hitCheck(shootY, shootX);

                if (hitOrMiss == 1) {
                    System.out.println();
                    System.out.println("You hit a ship! Try again:");
                } else if (hitOrMiss == 2) {
                    System.out.println();
                    System.out.println("You sank a ship! Specify a new target:");
                } else if (hitOrMiss == 0) {
                    System.out.println();
                    System.out.println("You missed. Try again:");
                } else if (hitOrMiss == 3) {
                    System.out.println();
                    return true;
                }
                shootTaken = true;

            }
        }
        return false;
    }

    public void start() {

        boolean won = false;

        System.out.println("Player 1, place your ships on the game field");
        player1.display(false);
        placesShips(player1);

        System.out.println("Press Enter and pass the move to another player");
        scanner.nextLine();
        scanner.nextLine();
        System.out.println("...");

        System.out.println("Player 2, place your ships on the game field");
        player2.display(false);
        placesShips(player2);

        System.out.println("Press Enter and pass the move to another player");
        scanner.nextLine();
        scanner.nextLine();
        System.out.println("...");
        System.out.println();

        while (true) {

            player2.display(true);
            System.out.println("---------------------");
            player1.display(false);
            System.out.println("Player 1, it's your turn:");
            if (shoot(player2)) {
                break;
            }

            System.out.println("Press Enter and pass the move to another player");
            scanner.nextLine();
            scanner.nextLine();
            System.out.println("...");
            System.out.println();

            player1.display(true);
            System.out.println("---------------------");
            player2.display(false);
            System.out.println("Player 2, it's your turn:");
            if (shoot(player1)) {
                break;
            }

            System.out.println("Press Enter and pass the move to another player");
            scanner.nextLine();
            scanner.nextLine();
            System.out.println("...");
            System.out.println();
        }

        System.out.println("You sank the last ship. You won. Congratulations!");
    }

    private int[] coordinates(String coordinate) {

        int y = coordinate.charAt(0) - 65;
        int x = 10;

        if (coordinate.length() > 2 && coordinate.charAt(1) == '1' && coordinate.charAt(2) == '0') {
            x = 9;
        } else if (coordinate.length() == 2) {
            x = coordinate.charAt(1) - 49;
        }

        if (y > 9 || y < 0 || x > 9 || x < 0) {
            System.out.println("Error! You entered the wrong coordinates! Try again:");
            System.out.println();
            return null;
        }

        return new int[]{y, x};

    }


}