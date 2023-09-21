/*  1
   212
  32123
 4321234
543212345 */
public class pattern_palindromic {
    public static void main(String arg[]) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                if (i == 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }

            System.out.println();
        }

    }
}
