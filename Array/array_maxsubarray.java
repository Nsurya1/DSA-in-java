//this is program for finding maximum form sum of subarray.
//this algorithm take o(n^3) complexity which is worse.

public class array_maxsubarray {
    public static void maxsubarray(int arr[]) {
        int currsum = 0;
        int max = Integer.MIN_VALUE;
        int start=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currsum = 0;
                for ( start = i; start <= j; start++) {
                    currsum = currsum + arr[start];

                }
                // System.out.println(currsum);
                System.out.println(arr[start]);
                if (max < currsum) {
                    max = currsum;
                }

            }

        }
        System.out.println(max);

    }

    public static void main(String arg[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        maxsubarray(arr);

    }
}
