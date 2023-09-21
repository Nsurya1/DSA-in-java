public class String_campareto {
    public static void main(String arg[]){
        String fruits[]={"apple","banana","mango","papaya"};
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){         //compareTo compare every character of string so its time complexty O(x*n )
                largest=fruits[i];
            }
            
        }
        System.out.println(largest);
    }
}
