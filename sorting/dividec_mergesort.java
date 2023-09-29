public class dividec_mergesort {
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[], int si, int en) {
        if (si >= en) {
            return;
        }
        int mid = si + (en - si) / 2;
        mergesort(arr, si, mid);
        mergesort(arr, mid + 1, en);
        merge(arr, si, mid, en);
    }

    public static void merge(int arr[], int si, int mid, int en) {
        int temp[] = new int[en - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= en) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];

        }
        // right part
        while (j <= en) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
 

    
    public static void main(String arg[]) {
        int arr[] = { 6, 5, 7, 3, 2, 1 };
        mergesort(arr, 0, arr.length - 1);
        printarr(arr);

    }
}
