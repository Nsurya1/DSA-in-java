public class array_concanetement {
    public static void conc(int arr[]) {
        int count = 0;
        int n = arr.length - 1;
        int a = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n - i; i++) {
            a = Integer.parseInt(Integer.toString(arr[i]) + Integer.toString(arr[n - i]));// append integer at another
                                                                                          // integer

            count += a;
        }
        System.out.println(count);
    }

    public static void main(String arg[]) {
        int arr[] = { 4, 3, 1, 6 };

        conc(arr);

    }
}
