package Array2DArrayBitManipulation;

public class TrappingRainwater {
    public static int trappingRainwater(int[] height) {
        int n = height.length;

        //calculate left max boundary - array's form
        int[] leftMax = new int[n];
        leftMax[0] = height[0]; //first element of height array will compare to itself only or will be maximum
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max( height[i], leftMax[i - 1]);

        }

        //calculate right max boundary - array's form
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1]; // last element of height array will maximum or compare to itself only
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);

        }
        int trappedWater = 0;
        //loop
        for (int i = 0; i < n; i++) {

            //water level
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //trapped water
            trappedWater += (waterLevel - height[i]);
        }
        return trappedWater;
    }

    public static void main(String[] args) {

        int [] height = {4,2,0,6,3,2,5};
        System.out.println("total trapped water: "+trappingRainwater(height));

    }
}

















