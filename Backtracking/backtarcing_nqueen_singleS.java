public class backtarcing_nqueen_singleS {
    public static boolean issafe(char board[][], int row, int col) {
        // vertical
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean nqueen(char board[][], int row) { // boolean type
        // base case
        if (row == board.length) {
            // print(board);
            return true;
        }
        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nqueen(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'x';
            }
        }
        return false;
    }

    public static void print(char board[][]) {
        System.out.println("-------chess----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        int n = 2;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        if (nqueen(board, 0)) {
            System.out.println("solution is possible");
            print(board);
        } else {
            System.out.println("solution is  not possible");
        }

    }
}
