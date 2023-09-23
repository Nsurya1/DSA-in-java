//find pow of a^n --time complexity->o(n)
public class recurtion_pow {
    public static int pow(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * pow(a, n - 1);
    }

    public static void main(String arg[]) {
        int a = 2;
        int n = 10;
        System.out.println(pow(a, n));
    }
}
