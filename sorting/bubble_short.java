import java.util.*;

public class bubble_short {
    public static void bubblesort(int arr[]) {
        for (int tern = 0; tern < arr.length - 1; tern++) {
            for (int j = 0; j < arr.length - 1 - tern; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

        return;
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String arg[]) {
        int arr[] = { 5, 4, 1, 3, 2, 6 };
        bubblesort(arr);
        printarr(arr);

    }
}
