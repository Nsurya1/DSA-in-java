import java.util.Stack;
// ---T.c=o(n)

public class nextgreaterelement {
    public static void greater(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int[] array = new int[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                array[i] = -1;
            } else {
                array[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String arg[]) {
        int arr[] = { 6, 8, 0, 9, 3 };
        greater(arr);

    }
}
// ---more question
// next greater right
// next greater left
// next smaller right
// next smaller left
