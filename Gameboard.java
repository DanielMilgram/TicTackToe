public class Gameboard {
    private Character[][] board;
    private boolean gameOver = false;

    public Gameboard() {
        board = new Character[3][3];
    }

    public boolean move(int x, int y, char player) {
        if(x < 1 || x > 3 || y < 1 || y > 3) {
            return false;
        }
        if(board[x - 1][y - 1] != null) {
            return false;
        }
        board[x - 1][y - 1] = player;

        //check board horizontally
        if(board[x-1][0] != null && board[x-1][1] != null && board[x-1][2] != null) {
            if(board[x-1][0] == player && board[x-1][1] == player && board[x-1][2] == player) {
                gameOver = true;
                System.out.println("Player " + player + " has won.");
            }
        }
        //checks board vertically
        if(board[0][y-1] != null && board[1][y-1] != null && board[2][y-1] != null) {
            if(board[0][y-1] == player && board[1][y-1] == player && board[2][y-1] == player) {
                gameOver = true;
                System.out.println("Player " + player + " has won.");
            }
        }

        //checks board diagonally
        

        return true;
    }

    public void printBoard() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[i][j] == null) {
                    System.out.print("_");
                }
                else {
                    System.out.print(board[i][j]);
                }
                System.out.print("   ");
            }
            System.out.println();
        }
    }
    public boolean isGameOver() {
        return gameOver;
    }
}
