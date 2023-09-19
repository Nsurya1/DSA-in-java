public class array_binarysearch {
    public static int binarysearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String arg[]) {
        int arr[] = { 3, 5, 6, 7, 13, 43, 12 };
        int key = 13;
        System.out.println("index for key:" + binarysearch(arr, key));
    }
}
