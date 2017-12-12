import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Gameboard board = new Gameboard();

        System.out.println("Hi! Welcome to Tic Tac Toe. Player O is first, player X is second.");
        System.out.println("\nHere is the board.");
        board.printBoard();

        while(!board.isGameOver()) {
            int row;
            int column;
            boolean moveWorked;

            //Player O's move
            do {
                do {
                    System.out.println("\nPlayer O, choose a row 1-3.");
                    row = keyboard.nextInt();
                }
                while(row < 1 || row > 3);
                do {
                    System.out.println("Player O, choose a column 1-3.");
                    column = keyboard.nextInt();
                }
                while(column < 1 || column > 3);

                moveWorked = board.move(row, column, 'O');
                if(!moveWorked) {
                    System.out.println("Please try again.");
                }
            } while(!moveWorked);

            board.printBoard();
            if(board.isGameOver()) {
                break;
            }

            //Player X's move
            do {
                do {
                    System.out.println("\nPlayer X, choose a row 1-3.");
                    row = keyboard.nextInt();
                }
                while(row < 1 || row > 3);
                do {
                    System.out.println("Player X, choose a column 1-3.");
                    column = keyboard.nextInt();
                }
                while(column < 1 || column > 3);

                moveWorked = board.move(row, column, 'X');
                if(!moveWorked) {
                    System.out.println("Please try again.");
                }
            } while(!moveWorked);

            board.printBoard();
            if(board.isGameOver()) {
                break;
            }
        }
    }
}
