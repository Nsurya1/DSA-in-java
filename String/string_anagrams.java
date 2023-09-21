public class string_anagrams {
    public static boolean anagram(String str1,String str2){
      int i=0;
      int j=str2.length()-1;
             while(i<str1.length()&&j>=0){
              if(str1.charAt(i)!=str2.charAt(j)){
                 return false;
              }
              i++;
              j--;
             }
               return true;
    }
    public static void main(String arg[]){
        String str1="vikas";
        String str2="sakiv";
        System.out.println(anagram(str1,str2));
    }
}
