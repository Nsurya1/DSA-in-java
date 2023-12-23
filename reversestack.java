
import java.util.*;
// --T.C--O(n);

public class reversestack {
    public static String reverse(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
           s.push(str.charAt(idx)) ;
           idx++;
    }

    StringBuilder sb=new StringBuilder("");
         while(!s.isEmpty()){
            char curr=s.pop();
            sb.append(curr);

         }
         return sb.toString();
    }
    public static  void main(String arg[]){
       System.out.print(reverse("abc"));
    }
       
}
