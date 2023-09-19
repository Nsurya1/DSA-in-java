public class array_trapping_rainwater {
    public static void trapping(int height[]) {
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        // find left maximum of graph
        for (int j = 1; j < height.length; j++) {
            leftmax[j] = Math.max(height[j], leftmax[j - 1]);

        }

        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];
        // find right maximum
        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        // find total water trapped
        int trappingwater = 0;
        for (int i = 0; i < height.length; i++) {
            int watertrap = 0;
            watertrap = Math.min(rightmax[i], leftmax[i]);
            trappingwater += (watertrap - height[i])>0?(watertrap - height[i]):0;
        }
        System.out.println("total water trapped:" + trappingwater);
    }

    public static void main(String arg[]) {
        int arr[] = {4,2,0,3,2,5 };
        trapping(arr);
    }
}
