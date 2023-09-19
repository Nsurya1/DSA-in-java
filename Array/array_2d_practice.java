public class array_2d_practice {

    // transpose the martix
    public static void transpose(int arr[][]) { // T.C=O(n^2)
        int transpose[][] = new int[arr[0].length][arr.length];
        int row = 0;
        int col = 0;
        for (row = 0; row < arr.length; row++) {
            for (col = 0; col < arr[0].length; col++) {
                transpose[col][row] = arr[row][col];
            }
        }

        // while (row < arr[0].length && col < arr.length) { //element have in only
        // diameter
        // transpose[row][col] = arr[col][row];
        // row++;
        // col++;
        // }

        printarr(transpose);

    }

    public static void printarr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static void main(String arg[]) {
        int arr[][] = { { 1, 2, 3 },
                { 4, 7, 6 },
                { 7, 8, 9 }
        };

        printarr(arr);
        transpose(arr);

        // count number of 7s
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }

        }
        // System.out.println(count);

        // print sum of row of second number
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][1];
        }

        // System.out.println(sum);

    }
}
