public class recurtion_printinc {
    public static void printinc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printinc(n-1);
        System.out.println(n);
    }
    public static void main(String arg[]){
        int n=10;
        printinc(n);
    }
}
