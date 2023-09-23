
public class recurtion_checksorted {
    public static boolean issorted(int arr[], int i) {
        int n = arr.length - 1;
        if (i == n) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return issorted(arr, i + 1);

    }

    public static void main(String arg[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(issorted(arr, 0));
    }
}
