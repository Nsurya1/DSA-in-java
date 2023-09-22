import java.util.*;

public class Arraylist_containerwithwater {
    // most water trapp in container

    public static void trapping(ArrayList<Integer> list) {

        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
           
             int watertrapp = Math.min(list.get(i), list.get(j)) * (j - i);
             
            max = Math.max(max, watertrapp);
            watertrapp = 0;
            if (list.get(i) < list.get(j)) {
                i++;
            } else {
                j--;
            }

        }
        System.out.println(max);
    }

    public static void main(String arg[]) {
        ArrayList<Integer> list = new ArrayList<>(); // 1,8,3,4,7,6,5
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(4);
        list.add(7);

        list.add(6);
        list.add(5);

        trapping(list);
    }
}
