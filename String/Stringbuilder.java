public class Stringbuilder {
    public static void main(String arg[]){
        StringBuilder str=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
             str.append(ch);
        }
        //time complecity-O(26) but in case of string t.c-O(26*n)or)(n^2)
        System.out.println(str);
        System.out.println(str.length());
    }
}
