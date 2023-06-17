public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            board.printBoard();
            Player currentPlayer = (board.getCurrentPlayer() == 1) ? player1 : player2;
            System.out.print(currentPlayer.getName() + " enter row and col: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            board.shoot(row - 1, col - 1);

            String result = board.wins();
            if (!result.equals("In progress...")) {
                board.printBoard();
                System.out.println(result);
                break;
            }
        }

        scanner.close();
    }
}

