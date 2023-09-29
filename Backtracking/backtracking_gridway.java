public class backtracking_gridway { // t.c=O(2^n+m)
    public static int gridway(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) { // col for last cell
            return 1;
        } else if (i == n || j == m) { // boundry cross condition
            return 0;
        }
        int w1 = gridway(i + 1, j, n, m);// for down
        int w2 = gridway(i, j + 1, n, m);// for right
        return w1 + w2;
    }

    public static void main(String arg[]) {
        int n = 3, m = 3;
        System.out.println(gridway(0, 0, n, m));
    }
}
