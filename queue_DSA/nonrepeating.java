// find non reapiting character in stream of character
 import java.util.*;     //T.C---O(n)
public class nonrepeating {
    public static void printnonrepeating(String s){
        Queue<Character>q=new LinkedList<>();
        int freq[]=new int [26];

        for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
             q.add(ch);

             freq[ch-'a']++;
             while(!q.isEmpty()&&freq[q.peek()-'a']>1){ //C---O(1)
                q.remove();
             }
            
             if(q.isEmpty()){
                System.out.print(-1+" ");
             }
             else{
                System.out.print(q.peek()+" ");
             }
            }
            System.out.println();    
        
    }
    public static void main(String args[]){
        String s="aabccxb";
        printnonrepeating(s);
    }
}
