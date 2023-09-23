public class recurtion_subsequence {
    public static void sequences(String str, int idx, String newstr) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        char ch = str.charAt(idx);
        // to be
        sequences(str, idx + 1, newstr + ch);
        // to not be
        sequences(str, idx + 1, newstr);
    }

    public static void main(String arg[]) {
        String str = "abc";
        sequences(str, 0, "");
    }
}
// time com->o(2^n) n is length of string
