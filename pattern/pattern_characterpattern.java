/*  A B C D E
F G H I
J K L
M N    
o   */
public class pattern_characterpattern {
    public static void mainO(String arg[]) {
        int n = 5;
        char ch = 'A';

        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
