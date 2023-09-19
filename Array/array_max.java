import java.util.*;

public class array_max {
  public static int max(int arr[], int n) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      // if(arr[0]<arr[i]){
      if (largest < arr[i]) {
        // arr[0]=arr[i];
        largest = arr[i];
      }
    }
    return largest;
  }

  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(max(arr, n));

  }
}
