public class dividec_rotedsearch {
    public static int search(int arr[], int tar, int si, int en) {
        if (si > en) {
            return -1;
        }
        int mid = si + (en - si) / 2;
        if (tar == arr[mid]) {
            return mid;
        }
        // case 1
        if (arr[si] <= arr[mid]) {
            // left
            if (arr[si] <= tar && tar < arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                // right
                return search(arr, tar, mid + 1, en);
            }
        }
        // case 2
        else {
            // right
            if (arr[mid] < tar && tar <= arr[en]) {
                return search(arr, tar, mid + 1, en);
            } else {
                // left
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String arg[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int tardx = search(arr, 7, 0, arr.length - 1);
        System.out.println(tardx);
    }
}
