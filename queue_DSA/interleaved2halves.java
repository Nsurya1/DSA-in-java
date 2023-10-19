import java.util.*;
public class interleaved2halves {
    public static void interleaved2halves(Queue<Integer> q){
        Queue<Integer>q1=new LinkedList<>();
        
        int size=q.size();
        int n=size/2;
       while(n>0){
            q1.add((Integer) q.remove());
           n--;
        }
        while(!q1.isEmpty()){
           q.add(q1.remove());
           q.add(q.remove());

        }
       
    }
   

    public static void main(String args[]){
        Queue <Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
       interleaved2halves(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
}
