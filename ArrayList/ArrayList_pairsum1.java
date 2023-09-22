import java.util.*;

public class ArrayList_pairsum1 {
    // two pointer approach only for sorted
    public static boolean pairsum(ArrayList<Integer> list, int target) {
        int i = 0;
        int j = list.size() - 1;
        while (i != j) {
            // case 1
            if (list.get(i) + list.get(j) == target) {
                return true;
            }
            // case 2
            if (list.get(i) + list.get(j) < target) {
                i++;
            } else {
                j--;
            }

        }
        return false;
    }

    public static void main(String arg[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(pairsum(list, 7));

    }
}
