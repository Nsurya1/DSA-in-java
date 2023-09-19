//most water trapp in container
public class array_trapping_water { //T.C---O(n^2)
    public static void trapping(int[] arr){
       
        int max=Integer.MIN_VALUE;
        int i=0;int j=arr.length-1;
        
           /*for(int i=0;i<arr.length;i++){ // T>c--O(n^2)
            int watertrapp=0;
                for(int j=i+1;j<arr.length;j++){
                    watertrapp=Math.min(arr[i],arr[j])*(j-i);   // Brute force method
                    if(watertrapp>max){
                        max=watertrapp;
                    }
                 }
           }*/
           
          
          while(i<j){
            int watertrapp=Math.min(arr[i],arr[j])*(j-i);
            max=Math.max(max,watertrapp);
            watertrapp=0;
            if(arr[i]<arr[j]){
            i++;
            }
            else{
                j--;
            }

          }
           System.out.println(max);
    }
    public static void main(String arg[]){
        int arr[]={1,8,3,4,7,6,5};
        trapping(arr);
    }
}
