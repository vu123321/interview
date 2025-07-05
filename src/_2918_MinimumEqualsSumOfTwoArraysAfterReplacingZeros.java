public class _2918_MinimumEqualsSumOfTwoArraysAfterReplacingZeros {

    public static void main(String[] args) {

    }


    private static long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0;
        long sum2 = 0;

        boolean hasZero = false;

        for (int value : nums1) {
            hasZero = value == 0;
            sum1 += Math.max(value, 1);

        }

        for (int value : nums2) {
            sum2 += Math.max(value, 1);
        }

        if (sum1 > sum2) {
            return minSum(nums2, nums1);
        }

        if (sum1 == sum2) {
            return sum1;
        }

        return hasZero ? sum2 : -1;
    }

    
}
