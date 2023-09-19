import java.util.*;

public class array_2D {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == key) {
                    System.out.println("key is found at" + i + " " + j + "index");
                    return true;
                }
            }
        }
        return false;
    }

    public static void maxandmin(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > largest) {

                    largest = matrix[i][j];
                }
                if (matrix[i][j] < minimum) {

                    minimum = matrix[i][j];
                }
            }
        }
        System.out.println(largest);
        System.out.println(minimum);

    }

    public static void main(String arg[]) {
        int n = 3, m = 3;
        int matrix[][] = new int[n][m];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 5);
        maxandmin(matrix);
    }
}
