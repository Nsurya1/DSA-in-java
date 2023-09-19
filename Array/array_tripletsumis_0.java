import java.util.Arrays;

//
public class array_tripletsumis_0 {
    public static void tripletsum(int arr[]) {
       
        Arrays.sort(arr); 
        for (int i = 0; i < arr.length-2; i++) {
           int j=i+1;
           int k=arr.length-1;
           if(arr[i]==arr[i+1]){  //for a
           while(j<k){
            int sum=arr[j]+arr[k];
                    if (sum==0-arr[i]) {
                      
                        System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);

                    }
                    else if(sum<0-arr[i]){
                        j++;

                    }
                    else{
                        k--;
                    }
                    while(j<k&&arr[j]==arr[j+1]) j++;
                    while(j<k&&arr[k]==arr[k-1]) k--;

           }
                
            }
        }
       
    }

    public static void main(String arg[]) {
        int arr[] = { -1, 0, 1, 2, -4, -1 };
        tripletsum(arr);
    }
}
