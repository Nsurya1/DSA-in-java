// push at the bottom of the stack 
import java.util.*;
public class pushatbottom{
    //by recurtion
    public static void Bottompush(Stack s,int data){
           if(s.isEmpty()){
               s.push(data);
               return ;
           }
           int top=(int) s.pop();
           Bottompush(s,data);
           s.push(top);

    }
    public static void main(String arg[]){
            Stack s=new Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);
            Bottompush(s,4);
          
            while(!s.isEmpty()){
                System.out.println(s.pop());
            }
    }
}
