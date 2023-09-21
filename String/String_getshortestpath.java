public class String_getshortestpath {
    public static float shortestpath(String str){
       int y=0;
       int x=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='N'){
               y++;
            }
            else if(ch=='S'){
                y--;
            }
            else if(ch=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String arg[]){
                String str="WNEENESENN"; 
                System.out.println(shortestpath(str));
    }
}
