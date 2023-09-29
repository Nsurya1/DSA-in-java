public class dividec_quicksort {
    public static void quicksort(int[] arr, int si, int en) {
        if (si >= en) {
            return;
        }
        int idx = partition(arr, si, en);
        quicksort(arr, si, idx - 1);
        quicksort(arr, idx + 1, en);

    }

    public static int partition(int[] arr, int si, int en) {
        int pivot = arr[en];
        int i = si - 1;// tmake place for els smaller than pivot

        for (int j = si; j < en; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }

        }
        i++;
        int temp = pivot;
        arr[en] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String arg[]) {
        int[] arr = { 5, 3, 4, 2, 6, 7, 1, 8 };
        quicksort(arr, 0, arr.length - 1);
        print(arr);
    }
}
