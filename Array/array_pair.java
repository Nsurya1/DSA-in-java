public class array_pair {
    public static void pair(int arr[]) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                
                System.out.println("(" + arr[i] + " ," + arr[j] + ")");
                tp++;
            }

        }
        System.out.println(tp);
    }

    public static void main(String arg[]) {
        int arr[] = { 2, 4, 6, 7, 8 };
        pair(arr);

    }

}
