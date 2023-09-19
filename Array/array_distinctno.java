
//this program for give true when element distinct in array and return false when element reapet
import java.util.*;

public class array_distinctno {
    public static boolean repeatornot(int arr[]) {

        // for (int i = 0; i < arr.length - 1; i++) {

        // for (int j = i + 1; j < arr.length - 1; j++) {
        // if (arr[i] == arr[j]) {

        // return false;
        // }

        // }
        // }

        // Arrays.sort(arr); // n*log(n)
        // for (int i = 0; i < arr.length - 1; i++) {
        // if (arr[i] == arr[i + 1]) {
        // return false;
        // }
        // }

        int freq[] = new int[9];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[arr[i]] > 2) {
                return false;
            }
        }

        return true;
    }

    public static void main(String arg[]) {
        // int arr[] = { 1, 1, 1, 3, 3, 2, 3, 4, 4 };
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(repeatornot(arr));

    }

}
// o(n^2)
