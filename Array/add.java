import java.util.*;
public class add {
    /**
     * @param args
     */
    public static void main(String args[]){
       /* int n1=45,n2=67,sum;
        sum=n1+n2;
        System.out.println("the sum is:"+sum);*/
       
      Scanner sc =new Scanner(System.in);
      int x,y,sum;
      System.out.println("Enter the first number: ");
       x=sc.nextInt();
      System.out.println("Enter th second number:");
       y=sc.nextInt();
      sum=x+y;
      int mul=x*y;
      System.out.println(sum);
      System.out.println(mul);

    }
}
