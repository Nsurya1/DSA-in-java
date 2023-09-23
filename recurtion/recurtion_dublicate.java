//remove duplicate character from the string
public class recurtion_dublicate {
    public static void removeduplicates(String str, int idx, StringBuilder newstr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        char ch = str.charAt(idx);
        if (map[ch - 'a'] == true) {
            removeduplicates(str, idx + 1, newstr, map);
        } else {
            map[ch - 'a'] = true;
            removeduplicates(str, idx + 1, newstr.append(ch), map);
        }
    }

    public static void main(String arg[]) {
        String str = "appnacolllage";
        removeduplicates(str, 0, new StringBuilder(), new boolean[26]);
    }
}
