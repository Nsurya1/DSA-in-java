import java.util.*;

public class Arraylist_reverse {

    // reverse
    public static void reverse(ArrayList<Integer> list) {
        int i = 0;
        int j = list.size() - 1;
        while (i <= list.size() / 2 || j >= list.size() / 2) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
        System.out.println(list + " ");
    }

    // swap element
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println(list);
    }

    public static void incre(ArrayList<Integer> list) {
        Collections.sort(list); // ascending
        Collections.sort(list, Collections.reverseOrder()); // descending
        // System.out.println(list);
    }

    public static void main(String arg[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(9);

        // incre(list);
        swap(list, 1, 3);
        // incre(list);

        // reverse
        reverse(list);

        // for (int i = 0; i <list.size(); i++) {
        // System.out.print(list.get(i) + " ");
        // }
        // System.out.println();
    }

}
