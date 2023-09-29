public class backtraking_array {
    public static void backtrack(int arr[], int i, int v) {
        if (i == arr.length) {
            print(arr); // print arr[i]=v first
            return;
        }
        arr[i] = v;
        backtrack(arr, i + 1, v + 1);
        arr[i] = arr[i] - 2;// backtracking start
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String arg[]) {
        int[] arr = new int[5];
        backtrack(arr, 0, 1);
        print(arr);
    }
}
