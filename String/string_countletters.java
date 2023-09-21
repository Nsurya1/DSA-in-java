public class string_countletters {
   
    public static void count(String str){
        int vowelcount=0;
        int consonentcount=0;
        int digitcount=0;
        int specialchar=0;
          for(int i=0;i<str.length();i++){
              char ch=str.charAt(i);
              if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
                 ch=Character.toLowerCase(ch);
                 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowelcount++;
                 }
                 else{
                    consonentcount++;
                 }
                }
             else if (ch>='0'&&ch<='9'){
                    digitcount++;
            }
                 else{
                    specialchar++;
                 }
               
          }
          System.out.println("vowel :"+vowelcount);
          System.out.println("consonent:"+consonentcount);
          System.out.println("digit:"+digitcount);
          System.out.println("special:"+specialchar);
    }

    public static void main(String arg[]) {
        String str = "abcdefgh1234/@#!$%";
        count(str);
    }
}
