
//find target element from sorted revrsed arraylist
import java.util.*;

public class Arraylist_pairsum2 {
    public static boolean pairlist2(ArrayList<Integer> list, int target) {
        int max = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                max = i;
                break;
            }
        }
        int rp = max;// largest
        int lp = max + 1;// smallest
        int n = list.size();
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;

            }
        }

        return false;
    }

    public static void main(String arg[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // 11,12,13,14,5,6,7,8
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(5);
        list.add(6);
        list.add(8);
        System.out.println(pairlist2(list, 28));

    }
}
