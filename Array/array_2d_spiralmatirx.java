import java.util.*;

public class array_2d_spiralmatirx {
    public static void spiralcord(int matrix[][]) {
        int rowstart = 0;
        int rowend = matrix.length - 1;
        int colstart = 0;
        int colend = matrix[0].length - 1;

        while (rowstart <= rowend && colstart <= colend) {
            // top
            for (int i = colstart; i <= colend; i++) {
                System.out.print(matrix[rowstart][i] + " ");
            }
            // right
            for (int i = rowstart + 1; i <= rowend; i++) {
                System.out.print(matrix[i][colend] + " ");
            }
            // bottom
            for (int i = colend - 1; i >= colstart; i--) {
                if (colstart == colend) {
                    break;
                }
                System.out.print(matrix[rowend][i] + " ");
            }

            // left
            for (int i = rowend - 1; i >= rowstart + 1; i--) {
                if (rowstart == rowend) {
                    break;
                }
                System.out.print(matrix[i][colstart] + " ");
            }
            rowstart++;
            colstart++;
            rowend--;
            colend--;
        }
        System.out.println();
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = 5, m = 5;
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        spiralcord(matrix);
    }
}
