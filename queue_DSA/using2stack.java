//implement the queue using two stack 

import java.util.Stack;

public class using2stack {
    static class Queue{
        static Stack <Integer>s1=new Stack<>();
         static Stack <Integer>s2=new Stack<>();

       public static boolean isEmpty(){
        return s1.isEmpty();
       }

       //add   T.C--O(n)
       public static void add(int data){
        
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
           s1.push(data);
           while(!s2.isEmpty()){
            s1.push(s2.pop());
           }

       }

       ///remove  T.C--O(1)
       public static int remove(){
        if(s1.isEmpty()){
           System.out.println("quueeu is empty");
           return -1;
        }
        return s1.pop();
       }
       
       //peek
       public static int peek(){
        if(s1.isEmpty()){
            System.out.println("quueeu is empty");
            return -1;
         }

         return s1.peek();
       }
    }

    public static void main(String arg[]){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
