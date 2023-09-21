public class String_substring {
    public static String substring(String str,int s,int e){
        String substr="";
        for(int i=s;i<e;i++){
            char ch=str.charAt(i);
            substr+=ch;
        }
        return substr;
    }
    public static void main(String arg[]){
        String str="helloworld";
        System.out.println(str.substring(0,3));
        System.out.println(substring(str,1,4));
    }
}
