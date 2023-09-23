public class recurtion_pairing {
    public static int pair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // choice
        // single
        int fnm1 = pair(n - 1);
        // pair
        int fnm2 = pair(n - 2);
        int pairways = (n - 1) * fnm2;
        // total ways
        int totalways = fnm1 + pairways;
        return totalways;
    }

    public static void main(String arg[]) {
        int n = 4;
        System.out.println(pair(n));

    }

}
