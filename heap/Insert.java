import java.util.*;

public class Insert {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { // O(logn)
            // insert at the last idx
            arr.add(data);
            int x = arr.size() - 1; // child idx
            int par = (x - 1) / 2; // par idx

            while (arr.get(x) < arr.get(par)) { // O(logn)
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        public void heapify(int i) {

            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minidx = i;

            if (left < arr.size() && arr.get(left) < arr.get(minidx)) {
                minidx = left;
            }
            if (right < arr.size() && arr.get(right) < arr.get(minidx)) {
                minidx = right;
            }

            if (minidx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx, temp);

                heapify(minidx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            // swap 1st and lastidx

            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // delete
            arr.remove(arr.size() - 1);

            // Heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String arg[]) {
        Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);

        pq.add(5);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }

    }
}
