public class recurtion_tiling_problem {
    public static int tiling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int fb = tiling(n - 1);
        int fl = tiling(n - 2);
        int tp = fb + fl;
        return tp;
    }

    public static void main(String arg[]) {
        System.out.println(tiling(4));
    }
}
