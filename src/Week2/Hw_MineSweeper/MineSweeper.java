package Week2.Hw_MineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int columnNumber;
    int size;
    int mineNumber;
    String[][] mineTable;
    String[][] gameBoard;
    boolean isDead = false;

    Random rand = new Random();
    Scanner input = new Scanner(System.in);

    // Set row number, column number, size of the mine table, mine number,
    // mineTable (which shows where mines are) and gameBoard (which will be shown to user in the game)
    // in constructor.

    MineSweeper(int rowNumber, int columnNumber) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.size = this.rowNumber * this.columnNumber;
        this.mineNumber = this.size / 4;
        this.mineTable = new String[rowNumber][columnNumber];
        this.gameBoard = new String[rowNumber][columnNumber];
    }

    // Prepare mineTable and gameBoard
    // Assign two random value to decide where mines will be
    void prepareGame() {
        for (int i = 0; i < mineTable.length; i++) {
            for (int j = 0; j < mineTable[0].length; j++) {
                mineTable[i][j] = "-";
                gameBoard[i][j] = "-";
            }
        }

        int count = 0;
        while (count < mineNumber) {
            int guess1 = rand.nextInt(this.rowNumber);
            int guess2 = rand.nextInt(this.columnNumber);
            if (mineTable[guess1][guess2].equals("-")) {
                mineTable[guess1][guess2] = "*";
                count++;
            }
        }
    }

    // Print sent matrix to the screen
    void print(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    // Run the game
    void run() {
        int row, col;
        prepareGame();

        System.out.println("Game area with mines: ");
        print(mineTable);

        System.out.println("Game board");
        print(gameBoard);

        System.out.println("Game started!");

        // While game is not over, while loop will continue
        while (!isDead) {
            System.out.print("Enter a row: ");
            row = input.nextInt();
            System.out.print("Enter a col: ");
            col = input.nextInt();

            // If user enters invalid coordinates, a warning will be shown
            // and user will need to enter new coordinates.
            if (row >= rowNumber || row < 0) {
                System.out.println("You entered an invalid coordinate. Try again!");
                continue;
            }
            if (col >= columnNumber || col < 0) {
                System.out.println("You entered an invalid coordinate. Try again!");
                continue;
            }

            // If coordinates are appropriate for the table size
            // Check if a mine is placed in the entered coordinates
            // If yes, game is over
            if (mineTable[row][col].equals("*")) {
                System.out.println("---------------------");
                System.out.println("Mine table is like that: ");
                print(mineTable);
                System.out.println("You stepped on a mine! Game Over!");
                isDead = true;
            } else {
                // Otherwise send coordinates to check function to check how many mines are there around the entered coordinate.
                check(row, col);
                if(isWin()){
                    // isWin function check if all places without mine are found
                    System.out.println("You won!");
                    break;
                }

            }
        }
    }

    void check(int row, int col) {
        int mineCount = 0;
        if (gameBoard[row][col].equals("-")) {
            for (int i = row - 1; i < row + 2; i++) {
                for (int j = col - 1; j < col + 2; j++) {

                    if (i >= 0 && j >= 0 && i < rowNumber && j < columnNumber && mineTable[i][j].equals("*")) {
                        mineCount++;
                    }
                    gameBoard[row][col] = Integer.toString(mineCount);
                }
            }
            print(gameBoard);
        }
    }

    boolean isWin() {
        int num = 0;
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                if (gameBoard[i][j].equals("-")) {
                    num++;
                }
            }
        }
        return num == 2;
    }
}


