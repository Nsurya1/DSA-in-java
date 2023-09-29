public class HeapSort {

    public static void heapify(int arr[], int i, int n) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int minIdx = i;
        if (left < n && arr[left] < arr[minIdx]) {
            minIdx = left;
        }
        if (right < n && arr[right] < arr[minIdx]) {
            minIdx = right;
        }
        if (minIdx != i) {
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            heapify(arr, minIdx, n);
        }

    }

    public static void heapSort(int arr[]) {
        // step = 1 --Build max heap --last level
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, 0, n);
        }
        // push at last idx

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 7, 10, 5, 6, 8, 9 };
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
