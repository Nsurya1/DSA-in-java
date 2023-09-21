public class string_alphabets {
    public static String voworcon(char ch) {
        String str = "aeiouAEIOU";
        return (str.indexOf(ch) != -1) ? "vowel" : "consonent";
    }

    

    public static void main(String arg[]) {
        char str = 'e';
        // if (str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u'){
        //     System.out.println("vowel");
        // } else {
        //     System.out.println("consonent");
        // }
        System.out.println(voworcon(str));

       
      

    }

}
