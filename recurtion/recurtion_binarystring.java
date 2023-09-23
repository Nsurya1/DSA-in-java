//print the binary string without take consocutive ones
public class recurtion_binarystring {
    public static void printbinarystring(int n, int lastplace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printbinarystring(n - 1, 0, str + "0");
        if (lastplace == 0) {
            printbinarystring(n - 1, 1, str + "1");
        }
        return;
    }

    public static void main(String arg[]) {
        printbinarystring(3, 0, "");

    }
}
