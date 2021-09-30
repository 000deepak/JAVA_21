package tictactoe;

public class TicTacToeGame {

    /*
     * tictactoe game project
     * @deepak 30/9/21
     *
     *
     */


    public static void main(String[] args) {
        System.out.println("welcome to tictactoe game");
        createBoard();

    }

    /*
        creating a tictactoe game board
     */
    public static void createBoard() {
        char[] board = new char[10];
        for (int i = 1; i < board.length; i++)
            board[i] = ' ';
    }

}
