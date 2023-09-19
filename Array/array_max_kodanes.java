public class array_max_kodanes {
    public static void maxsubarray(int arr[]) {
        int tempstart = 0;
        int start = 0;
        int end = 0;

        int maxsum = arr[0];
        int currsum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currsum + arr[i]) {
                currsum = arr[i];
                tempstart = i;
            } else {
                currsum += arr[i];
            }

            if (maxsum < currsum) {
                maxsum = currsum;
                start = tempstart;
                end = i;
            }
        }
        int maxarr[] = new int[end - start + 1];
        for (int j = start; j <= end; j++) {
            maxarr[j - start] = arr[j];
        }

        for (int num : maxarr) {
            System.out.print(num + ",");
        }
        System.out.println();
        System.out.println(maxsum);
        // int maxsum = Integer.MIN_VALUE;
        // int currsum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // currsum = currsum + arr[i];
        // if (currsum < 0) {
        // currsum = 0;
        // }
        // if (maxsum < currsum) {
        // maxsum = currsum;
        // }
        // }
        // System.out.print(maxsum);
        // }

    }

    public static void main(String arg[]) {
        int arr[] = { -2, -3, 6, 8, 10 };
        maxsubarray(arr);

    }
}
