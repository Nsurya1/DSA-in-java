//shift 'x'at the last of string
public class recurtion_shifatlast {
    public static void shiftatlast(String str, int idx, char element, StringBuilder sb1, int count) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                sb1.append('x');
            }
            System.out.print(sb1.toString());
            return;
        }
        char ch = str.charAt(idx);

        if (ch != element) {
            sb1.append(ch);
        } else {
            count++;
        }
        shiftatlast(str, idx + 1, element, sb1, count);

    }

    public static void main(String arg[]) {
        String str = "axbxcxd";
        shiftatlast(str, 0, 'x', new StringBuilder(""), 0);
    }
}
