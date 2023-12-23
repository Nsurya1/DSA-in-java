import java.util.*;

public class reverseinteger {
    public static void Bottom(Stack s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = (int) s.pop();
        Bottom(s, data);
        s.push(top);
    }

    public static void reverse(Stack s) {
        if (s.isEmpty()) {
            return;
        }
        int top = (int) s.pop();
        reverse(s);
        Bottom(s, top);
        s.push(top);
    }

    public static void print(Stack s) {
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }

    public static void main(String arg[]) {
        Stack s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // 3-2-1
        reverse(s);
        print(s);
        // 1-2-3

    }
}