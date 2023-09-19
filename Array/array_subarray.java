public class array_subarray {
    public static void subarray(int arr[]) {
        int tp = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print(arr[j] + ",");
                tp++;

            }
            System.out.println();

        }

        System.out.println(tp);

    }

    public static void main(String arg[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        subarray(arr);

    }
}
