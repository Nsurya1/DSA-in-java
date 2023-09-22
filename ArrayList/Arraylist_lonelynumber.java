import java.util.ArrayList;

public class Arraylist_lonelynumber {

    public static void lonelyNum(ArrayList<Integer>list){
        if(list.get(0)!=list.get(1)-1 ){
              System.out.println(list.get(0)+" ");
        }
       
        for(int i=1;i<list.size()-1;i++){
           
            if(list.get(i)!=list.get(i+1)-1 && list.get(i)!=list.get(i+1)+1 && list.get(i)!=list.get(i-1)-1 && list.get(i)!=list.get(i-1)+1){
                System.out.println(list.get(i)+" ");
            }
        }
        if(list.get(list.size()-1)!=list.get(list.size()-2)+1 || list.get(list.size()-1)!=list.get(list.size()-2)-1){
            System.out.println(list.get(list.size()-1)+" ");
        }
    }
    public static void main(String arg[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        lonelyNum(list);
    }
}
