public class backtracking_subset {
    public static void subset(String str, String ans, int i) {
        if (i == str.length()) {
            if (str.length() == 0) {
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
        // yes case
        subset(str, ans + str.charAt(i), i + 1);
        subset(str, ans, i + 1);

    }

    public static void main(String arg[]) {
        String str = "abc";

        subset(str, "", 0);
    }
}
