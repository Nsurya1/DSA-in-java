//print the first andlast index of an element in a string

public class recurtion_firstlastindex {
    public static int first = -1;
    public static int last = -1;

    public static void findoccu(String str, int idx, char element) {

        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if (str.charAt(idx) == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }

        }
        findoccu(str, idx + 1, element);
    }

    public static void main(String arg[]) {
        String str = "bacdaahfgah";
        findoccu(str, 0, 'a');
    }

}
