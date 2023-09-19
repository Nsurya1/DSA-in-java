public class array_reverse {
    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }

    }


    public static void main(String arg[]) {
        int arr[] = { 1, 2, 3, 4 };
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
