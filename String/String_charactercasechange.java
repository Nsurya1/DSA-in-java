public class String_charactercasechange {
    public static void charcasechange(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println("after change:" + sb.toString());
    }

    public static void main(String arg[]) {
        String str = "NiteSh SuRYavaNsHi";
        String str1 = str.toLowerCase(); // conver the string into lowercase
        System.out.println("original string:" + str1);
        charcasechange(str);
    }
}
