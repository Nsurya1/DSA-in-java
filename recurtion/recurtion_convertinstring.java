public class recurtion_convertinstring {
  public static void instring(int n) {
    if (n == 0) {
      return;
    }
    int temp = n % 10;
    instring(n / 10);

    String str[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    System.out.print(str[temp] + " ");
  }

  public static void main(String arg[]) {
    int n = 105;
    instring(n);
  }
}
