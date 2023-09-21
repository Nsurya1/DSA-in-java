public class string_compression {
    public static String stringcompression(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < (str.length() - 1) && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            sb.append(count);
        }
        return sb.toString();
    }

    public static void main(String arg[]) {
        String str = "aaabbbcccdd";
        System.out.println(stringcompression(str));
    }
}
