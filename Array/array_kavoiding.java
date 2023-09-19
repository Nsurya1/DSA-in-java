import java.util.*;

public class array_kavoiding {
    public static void main(String arg[]) {
        int n = 5;
        int k = 4;
        int result[] = new int[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            if (result[i - 1] + 1 != k - 1) {
                result[i] = result[i - 1] + 1;
            } else {
                result[i] = k;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
