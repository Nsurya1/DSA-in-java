public class recurtion_countoccurence {
    public static void count(int arr[], int key, int i, int count) {
        if (i == arr.length) {
            System.out.println(count);
            return;
        }
        if (arr[i] != key) {
            count(arr, key, i + 1, count);
        } else {
            count(arr, key, i + 1, count + 1);
        }

    }

    public static void main(String arg[]) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int count = 0;
        count(arr, 2, 0, count);
    }
}
