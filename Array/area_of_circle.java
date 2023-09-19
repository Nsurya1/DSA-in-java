import java.util.Scanner;

public class area_of_circle {
    /**
     * @param args
     */
    public static void main(String[] args) {
        float radius, area, pi = 3.14f; // compiler 3.14 take as a double so we use f for convert into float
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        radius = sc.nextInt();
        area = pi * radius * radius;
        System.out.println(area);

        float x = 25.16f;
        int y = (int) x;
        System.out.println(y);

        char ch = 'x';
        int number = ch;
        System.out.println(number);
    }

}
