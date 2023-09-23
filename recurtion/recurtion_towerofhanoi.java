//tower of hanoi
public class recurtion_towerofhanoi {
    public static void towerofhanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer" + " " + src + " " + "from" + " " + dest);
            return;
        }
        // transfer tp n-1 from src to helper using dest as 'helper'
        towerofhanoi(n - 1, src, dest, helper);
        // transfer nth from src to dest
        System.out.println("transfer" + " " + src + " " + "from" + " " + dest);
        // transfer n-1 from helper tp dest using src as helper
        towerofhanoi(n - 1, helper, src, dest);
    }

    public static void main(String arg[]) {
        int n = 3;
        towerofhanoi(n, "S", "H", "D");
    }
}
