public class recurtion_factorial {
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int fct = fact(n - 1);
        return n * fct;

    }

    public static void main(String arg[]) {
        int n = 5;
        System.out.println(fact(n));
    }
}
