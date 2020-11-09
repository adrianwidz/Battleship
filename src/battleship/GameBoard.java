package battleship;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {

    private final String[][] field = new String[10][10];
    private List<Ship> ships = new ArrayList<>();
    private int shipsRemain;

    public GameBoard() {

        this.shipsRemain = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                field[i][j] = "~";
            }
        }
    }

    public void display(boolean fog) {

        System.out.print(" ");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + (i + 1));
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {

            System.out.print((char) (65 + i) + " ");

            for (int j = 0; j < 10; j++) {

                if (fog && field[i][j].equals("O")) {
                    System.out.print("~ ");
                } else {
                    System.out.print(field[i][j] + " ");
                }

            }
            System.out.println();
        }
    }

    private boolean fieldCheck(int y, int x) {

        if (field[y][x].equals("O")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean collisionCheck(int beginningY, int beginningX, int endY, int endX) {

        if (beginningY > 0) {
            beginningY -= 1;
        }
        if (endY < 9) {
            endY += 1;
        }
        if (beginningX > 0) {
            beginningX -= 1;
        }
        if (endX < 9) {
            endX += 1;
        }

        for (int i = beginningY; i <= endY; i++) {
            for (int j = beginningX; j <= endX; j++) {
                if (fieldCheck(i, j)) {
                    return true;
                }
            }
        }

        return false;
    }


    public boolean addShip(Ship ship, int beginningY, int beginningX, int endY, int endX) {


        if (beginningY != endY && beginningX != endX) {

            System.out.println("Error! Wrong ship location! Try again:");
            System.out.println();
            return false;
        }

        if (beginningY == endY && beginningX > endX) {
            int directionSwitch = beginningX;
            beginningX = endX;
            endX = directionSwitch;
        } else if (beginningX == endX && beginningY > endY) {
            int directionSwitch = beginningY;
            beginningY = endY;
            endY = directionSwitch;
        }

        if (endY - beginningY != ship.getSize() - 1 && endX - beginningX != ship.getSize() - 1) {

            System.out.println("Error! Wrong length of the " + ship.getName() + "! Try again:");
            System.out.println();
            return false;
        }

        if (collisionCheck(beginningY, beginningX, endY, endX)) {

            System.out.println("Error! You placed it too close to another one. Try again:");
            System.out.println();
            return false;
        }


        String[] shipLocation = new String[ship.getSize()];
        int loc = 0;
        for (int i = beginningY; i <= endY; i++) {
            for (int j = beginningX; j <= endX; j++) {
                field[i][j] = "O";
                shipLocation[loc] = "" + i + j;
                loc++;
            }
        }

        ship.setLocation(shipLocation);
        ships.add(ship);
        shipsRemain += ship.getSize();
        return true;
    }

    public int hitCheck(int y, int x) {

        for (Ship ship: ships) {

            String[] shipLocation = ship.getLocation();
            for (String cord: shipLocation) {

                int shipY = Integer.parseInt(cord.charAt(0) + "");
                int shipX = Integer.parseInt(cord.charAt(1) + "");

                if (y == shipY && x == shipX) {

                    field[y][x] = "X";
                    ship.damage();
                    shipsRemain--;

                    if (ship.getSize() == 0) {
                        if (shipsRemain <= 0) {
                            return 3;
                        }
                        return 2;
                    } else {
                        return 1;
                    }
                }

            }
        }

        field[y][x] = "M";
        return 0;
    }

}