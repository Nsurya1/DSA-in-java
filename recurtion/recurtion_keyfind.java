//find the first occurence of an element in an array
public class recurtion_keyfind {
    public static int key(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return key(arr, key, i + 1);
    }

    public static void main(String arg[]) {
        int arr[] = { 1, 4, 2, 3, 2, 5, 6 };
        System.out.println(key(arr, 2, 0));
    }
}
