public class pattern_halfpattern {
    public static void main(String arg[]) {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
