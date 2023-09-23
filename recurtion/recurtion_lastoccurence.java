public class recurtion_lastoccurence {
    public static int lastoccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfind = lastoccurance(arr, key, i + 1);
        if (isfind == -1 && arr[i] == key) {
            return i;
        }

        return isfind;

    }

    public static void main(String arg[]) {
        int arr[] = { 1, 2, 3, 4, 2, 2 };
        System.out.println(lastoccurance(arr, 2, 0));
    }
}
