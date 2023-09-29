public class countingsotr {
    public static void countingsort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // store frequency of element in count array
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // int max = Integer.MIN_VALUE;
        // int k = 0;
        // // calculate which repeat most time
        // for (k = 0; k < count.length; k++) {
        // if (count[k] > max) {
        // max = count[k];
        // }

        // }
        // System.out.println(max);

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void main(String arg[]) {
        int arr[] = { 1, 0, 0, 4, 1, 3, 2, 3, 4, 1, 1 };
        countingsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
