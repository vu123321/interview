package trappingrainwater;

public class TrappingRainWater {

    public static int trappingRainWater(int[] height) {

        int left = 0, right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        int total = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                total += leftMax - height[left];
                left++;
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                total += rightMax - height[right];
            }
        }

        return total;

    }

    public static void main(String[] args) {

//        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//        System.out.println("water : " + trappingRainWaterImpl(arr));

//        System.out.println("---------------maxArea:  ");
//        int[] arrays = {1, 8, 6, 2, 5, 4, 8, 3, 1};
//        System.out.println("maxArea-=------------- : " + maxAreaContainerWithMostWater(arrays));

        System.out.println("----trappingRainWater::");
        System.out.println(trappingRainWater(new int[]{4, 2, 0, 3, 2, 5}));

    }


    private static int trappingRainWaterImpl(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        int water = 0;


        return 0;
    }

    static int maxAreaContainerWithMostWater(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {

            int currentArea = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(currentArea, maxArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }


        return maxArea;

    }

    public static double maxAreaContainerWithMostWaterV2(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);

            maxArea = Math.max(currentArea, maxArea);
            if (height[right] < height[left]) {
                right--;
            } else {
                left++;
            }
        }

        return maxArea;

    }


}

