//print sum of digonal element of matrix

public class array_2D_sumof_diagonal {
    public static void main(String arg[]) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 4, 5, 6, 7 },
                { 2, 3, 4, 5 },
                { 9, 8, 7, 6 } };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
                if (i + j == arr.length - 1) {
                    sum += arr[i][j];
                }
            }

        }
        System.out.println(sum);
    }
}
