//this is prefix method to finding maximum number form sum of array
//time complexty is n^2
public class array_max_prefix {
    public static void maxsubarray(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        int k;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        System.out.print(prefix[0] + " ");
        for (k = 1; k < prefix.length; k++) {
            prefix[k] = prefix[k - 1] + arr[k];
            System.out.print(prefix[k] + " ");

        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            currsum = 0;
            for (int j = i; j < arr.length; j++) {
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];// ternary
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("maximum subarray:" + maxsum);
    }

    public static void main(String arg[]) {
        int arr[] = { 1, -1, 2, -3, 5 };
        maxsubarray(arr);
    }
}
