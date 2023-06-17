class Board {
    private char[][] board;
    private int currentPlayer;

    public Board() {
        board = new char[3][3];
        currentPlayer = 1;
        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
            }
        }
    }

    public void shoot(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ') {
            System.out.println("Invalid move. Try again.");
            return;
        }

        char symbol = (currentPlayer == 1) ? 'X' : 'O';
        board[row][col] = symbol;
        currentPlayer = 3 - currentPlayer;
    }

    public String wins() {
        if (checkWin('X'))
            return "Player 1 wins!";
        if (checkWin('O'))
            return "Player 2 wins!";
        if (isDraw())
            return "Draw!";
        return "In progress...";
    }

    private boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++) {
            // Check rows
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol)
                return true;
            // Check columns
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)
                return true;
        }
        // Check diagonals
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
            return true;
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)
            return true;
        return false;
    }

    public boolean isDraw() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ')
                    return false;
            }
        }
        return true;
    }

    public void printBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col]);
                if (col < 2)
                    System.out.print(" | ");
            }
            System.out.println();
            if (row < 2)
                System.out.println("---------");
        }
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }
}

