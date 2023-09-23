public class recurtion_reversestring {
    public static void reverse(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverse(str, idx - 1);
    }

    public static void main(String arg[]) {
        String str = "reverse";
        int n = str.length() - 1;
        reverse(str, n);
    }
}
