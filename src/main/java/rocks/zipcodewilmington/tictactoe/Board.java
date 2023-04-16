package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */

//this defines the Board class and marks it public (can be accessed by other classes)
public class Board {

    //declaration of private 2D array 'board'. should hold the state of the game board.
    // char can hold empty as NULL
    private Character[][] board;

    /*constructor for 'Board' class. takes 2d 'Character' array called 'matrix' as a parameter. intended to represent initial
    state of the game board. currently empty and does nothing with 'matrix' param
     */
    public Board(Character[][] matrix) {
        board = new Character[3][3]; //create new 3x3 board

        //copy elements of 'matrix' into the board
        for (int i = 0; i < 3; i++) { //will loop through first indice
            for (int j = 0; j < 3; j++) { //loop through second indice
                board[i][j] = matrix[i][j]; //assign pos on board value of corresponding pos on matrix

            }
        }
    }

    //check state of game board and return bool indicating if game is in favor of 'X'
    public Boolean isInFavorOfX() {
        //check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') {
                return true;
            }
        }

        //check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == 'X' && board[1][j] == 'X' && board[2][j] == 'X') {
                return true;
            }
        }

        //check for diagonals
        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            return true;
        }
        if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            return true;
        }
        return false;
    }

    //check state of game board and return bool indicating if game is in favor of 'O'
    public Boolean isInFavorOfO() {
        //check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O') {
                return true;
            }
        }

        //check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == 'O' && board[1][j] == 'O' && board[2][j] == 'O') {
                return true;
            }
        }

        //check for diagonals
        if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            return true;
        }
        if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
            return true;
        }
        return false;
    }

    /*check state of game board and return bool indicating if game is tied
    complete this by checking if there are any empty spaces left*/
    public Boolean isTie() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    //return the winner of the game (if there is one)
    public String getWinner() {
        if (isInFavorOfX()) {
            return "X";
        } else if (isInFavorOfO()) {
            return "O";
        } else {
            return "";
        }
    }
}



