import java.util.PriorityQueue;

public class SlidingWindow {
    static class Pair implements Comparable<Pair> {
        int val;
        int idx;

        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) {
            // return this.val - p2.val; // Ascending
            return p2.val - this.val;
        }
    }

    public static void main(String args[]) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int n = arr.length;
        int k = 3;
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        int res[] = new int[n - k + 1];
        // first window store in pq

        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }

        res[0] = pq.peek().val;

        for (int i = k; i < arr.length; i++) {
            while (pq.size() > 0 && pq.peek().idx <= (i - k)) {
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            res[i - k + 1] = pq.peek().val;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
