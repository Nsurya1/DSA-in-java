
//string is immutable in java
import java.util.*;

public class string {
    public static void print(String name) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'n') {

                System.out.print(name.charAt(i) + " ");
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String arg[]) {
        char ch[] = { 'a', 'b', 'c', 'd', 'e' };
        String str = "abc";
        String str1 = new String("abcd");

        Scanner sc = new Scanner(System.in);
        String name;
        // name=sc.next();
        // System.out.println(name);
        /*
         * name = sc.nextLine();
         * System.out.println(name);
         * System.out.println(name.length());
         */

        String firstname = "nitesh";
        String lastname = "nitesh";
        String name3 = new String("nitesh");
        String fullname = firstname + " " + lastname;
        print(fullname);
        System.out.println(firstname.equals(lastname) + " " + firstname.equals(name3));
        System.out.println(firstname == name3);
    }
}
