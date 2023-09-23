public class recurtion_printdec {
    public static void printdec(int n) {
        if (n == 1) { // base condition->when we not use base condition then this program become stack
                      // overflow
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printdec(n - 1);
    }

    public static void main(String arg[]) {
        int n = 10;
        printdec(n);
    }
}
