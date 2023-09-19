//search a key from row and col wise sorted matrix
public class array_2D_searchkey {
    public static boolean searchkey(int arr[][], int key) {
        int row = 0;
        int col = arr[0].length;
        while (row < arr.length && col > 0) {
            if (arr[row][col - 1] == key) {
                return true;
            } else if (arr[row][col - 1] < key) {
                row++;

            } else {
                col--;
            }
        }
        return false;
    }

    public static void main(String arg[]) {
        int arr[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 38, 49 },
                { 32, 33, 39, 50 } };
        // int arr[][]={{1,2,3}};
        int key = 15;
        System.out.println(searchkey(arr, key));
    }
}
// time complexty-o(n+m)