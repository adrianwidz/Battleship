Description

Simulation of the battleships game for two players. Each palyer is given 10×10 game field and five ships to arrange on that field.
When players place all their ships the game starts and it goes on until one of the players has all of his ship destroyed.
 
Example

State of game field on different stages of game

    Player 1, place your ships on the game field

      1 2 3 4 5 6 7 8 9 10
    A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~

    Enter the coordinates of the Aircraft Carrier (5 cells):

    > F3 F7

      1 2 3 4 5 6 7 8 9 10
    A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    F ~ ~ O O O O O ~ ~ ~
    G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    
    .
    .
    .

    Enter the coordinates of the Destroyer (2 cells):

    > E6 D6

    Error! You placed it too close to another one. Try again:

    > I2 J2

      1 2 3 4 5 6 7 8 9 10
    A O ~ ~ ~ ~ ~ ~ ~ ~ ~
    B O ~ ~ ~ ~ ~ ~ ~ O ~
    C O ~ ~ ~ ~ ~ ~ ~ O ~
    D O ~ ~ ~ ~ ~ ~ ~ O ~
    E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    F ~ ~ O O O O O ~ ~ ~
    G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    I ~ O ~ ~ ~ ~ ~ ~ ~ ~
    J ~ O ~ ~ ~ ~ ~ O O O
    
    Press Enter and pass the move to another player
    ...
    Player 2, place your ships to the game field

      1 2 3 4 5 6 7 8 9 10
    A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    
    .
    .
    .
    
      1 2 3 4 5 6 7 8 9 10
    A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    C ~ ~ ~ ~ ~ ~ ~ O ~ ~
    D ~ ~ ~ O O O ~ O ~ ~
    E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    F ~ ~ O O O O ~ O ~ ~
    G ~ ~ ~ ~ ~ ~ ~ O ~ ~
    H ~ O O O O O ~ O ~ ~
    I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    
    .
    .
    .
    
      1 2 3 4 5 6 7 8 9 10
    A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    ---------------------
      1 2 3 4 5 6 7 8 9 10
    A O ~ ~ ~ ~ ~ ~ ~ ~ ~
    B O ~ ~ ~ ~ ~ ~ ~ O ~
    C O ~ ~ ~ ~ ~ ~ ~ O ~
    D O ~ ~ ~ ~ ~ ~ ~ O ~
    E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    F ~ ~ O O O O O ~ ~ ~
    G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    I ~ O ~ ~ ~ ~ ~ ~ ~ ~
    J ~ O ~ ~ ~ ~ ~ O O O

    Player 1, it's your turn:

    > I3

    You missed!
    Press Enter and pass the move to another player
    ...

      1 2 3 4 5 6 7 8 9 10
    A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    ---------------------
      1 2 3 4 5 6 7 8 9 10
    A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    C ~ ~ ~ ~ ~ ~ ~ O ~ ~
    D ~ ~ ~ O O O ~ O ~ ~
    E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    F ~ ~ O O O O ~ O ~ ~
    G ~ ~ ~ ~ ~ ~ ~ O ~ ~
    H ~ O O O O O ~ O ~ ~
    I ~ ~ M ~ ~ ~ ~ ~ ~ ~
    J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~

    Player 2, it's your turn:

    > A1

    You hit a ship!
    Press Enter and pass the move to another player
    ...
    
    .
    .
    .
    

      1 2 3 4 5 6 7 8 9 10
    A X M ~ ~ ~ ~ ~ ~ ~ ~
    B X ~ ~ M ~ ~ M ~ X ~
    C X ~ ~ ~ ~ ~ ~ ~ X ~
    D X ~ ~ ~ ~ M ~ ~ X ~
    E ~ ~ ~ M ~ ~ M ~ M ~
    F M ~ X X X X X M ~ ~
    G ~ ~ ~ ~ ~ ~ M ~ ~ ~
    H ~ M M ~ ~ ~ ~ ~ ~ M
    I ~ X ~ ~ M ~ ~ M ~ ~
    J ~ X ~ ~ ~ ~ M X X X

    You sank the last ship. You won. Congratulations!
    
