//find power of a^n in way of optimize time com->O(logn)
public class recurtion_powoptimize {
    public static int pow(int a, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 != 0) {
            int p = pow(a, n / 2);
            return a * p * p;
        }

        int p = pow(a, n / 2);
        return p * p;
    }

    public static void main(String arg[]) {
        int a = 2;
        int n = 10;
        System.out.println(pow(a, n));
    }
}
