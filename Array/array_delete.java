import java.util.*;

public class array_delete {
    public static void main(String arg[]) {
        int n = 5;
        int arr[] = { 2, 3, 4, 5, 6 };
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i + 1];

        }
        n = n - 1;
        System.out.print(Arrays.toString(arr));
    }
}
