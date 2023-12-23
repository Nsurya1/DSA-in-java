import java.util.*; //-----T.C===O(n)

public class validparentheses {
    public static boolean parentheses(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // opening
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }

                // closing

                if ((ch == ')' && s.peek() == '(') || (ch == '}' && s.peek() == '{')
                        || (ch == ']' && s.peek() == '[')) {
                    s.pop();
                } else {
                    return false;
                }

            }
        }
        if (s.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String arg[]) {
        String str = "{({})[]}";
        System.out.println(parentheses(str));
    }
}
