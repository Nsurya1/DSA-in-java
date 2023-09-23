//print substring of string which start end and at same character
public class recurtion_startendsame {
  public static int startendsame(String str, int i, int j, int n) {
    if (n <= 0 || n == 1) {
      return n;
    }

    int temp = startendsame(str, i + 1, j, n - 1) + startendsame(str, i, j - 1, n - 1)
        - startendsame(str, i + 1, j - 1, n - 2);
    if (str.charAt(i) == str.charAt(j)) {

      temp++;
    }
    return temp;
  }

  public static void main(String arg[]) {
    String str = "aba";
    int n = str.length();
    System.out.println(startendsame(str, 0, str.length() - 1, str.length()));

  }
}
