
//print unique subsequences  of string
import java.util.HashSet;

public class recurtion_subsequenceunique {
    public static void uniqesubseq(String str, int idx, String newstr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newstr)) { // check str present in newstr
                return;
            } else {
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }

        char ch = str.charAt(idx);
        uniqesubseq(str, idx + 1, newstr + ch, set);
        uniqesubseq(str, idx + 1, newstr, set);
    }

    public static void main(String arg[]) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqesubseq(str, 0, "", set);
    }
}
