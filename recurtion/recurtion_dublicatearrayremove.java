import java.util.*;

public class recurtion_dublicatearrayremove {
    public static void removedupletter(int arr[], int i, List<Integer> newarr) {
        if (i == arr.length - 1) {
            newarr.add(arr[i]);
            print(newarr);
            return;
        }
        if (arr[i] != arr[i + 1]) {
            newarr.add(arr[i]);
            removedupletter(arr, i + 1, newarr);
        } else {

            removedupletter(arr, i + 1, newarr);
        }

    }

    public static void print(List<Integer> newarr) {
        for (int i = 0; i < newarr.size(); i++) {
            System.out.print(newarr.get(i) + ",");
        }
        System.out.println();
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 9, 9 };

        removedupletter(arr, 0, new ArrayList<>());

    }
}
