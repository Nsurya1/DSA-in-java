//find length of the string
public class recurtion_lengthstring {
    public static int strlength(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return strlength(str.substring(1)) + 1;
    }

    public static void main(String arg[]) {
        String str = "nitesh";
        System.out.println(strlength(str));

    }
}
