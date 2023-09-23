//calculator nth term of fibnocci
public class recurtion_fibnocci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int f1 = fib(n - 1);
        int f2 = fib(n - 2);
        int f3 = f1 + f2;

        return f3;
    }

    public static void main(String arg[]) {
        int n = 5;
        System.out.println(fib(n));

    }
}
