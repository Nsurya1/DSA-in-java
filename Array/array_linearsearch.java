import java.util.*;

public class array_linearsearch {
    public static int linearsearch(int arr[], int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i; // index
            }
        }
        return -1;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(linearsearch(arr, n, key));
    }
}