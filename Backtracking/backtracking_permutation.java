public class backtracking_permutation {
    public static void findpermutation(String str, String ans) {
        if (str.length() == 0) { // base case
            System.out.println(ans);
            return;
        }
        // recurtion ------t.c=O(n*n!)--
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde"="ab"+"de"="abde"
            String newstr = str.substring(0, i) + str.substring(i + 1); // for removing pick element
            findpermutation(newstr, ans + curr);
        }
    }

    public static void main(String arg[]) {
        String str = "abc";
        findpermutation(str, "");
    }
}
