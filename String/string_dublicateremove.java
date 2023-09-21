//remove  repeat character from the string
public class string_dublicateremove {
    public static void repeat(String str){
        StringBuilder sb=new StringBuilder();
        int i=0;
        boolean map[ ]=new boolean[26];
        while(i<str.length()){
            char ch=str.charAt(i);
            if(map[ch-'a']==true){
                i++;
            }
            else{
                map[ch-'a']=true;
                sb.append(ch);
            }

        }
System.out.println(sb.toString());
    }
    public static void main(String arg[]){
        String str="appanacollage";
        repeat(str);
    }
}
