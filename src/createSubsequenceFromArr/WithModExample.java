package createSubsequenceFromArr;

import java.util.Arrays;

public class WithModExample {

    private static final int MOD = 1000000007;

    public static void main(String[] args) {

//        int[] nums = {3,5,6,7};
//        int target = 9;
//        System.out.println("numSubseq: "+numSubseq(nums, target));
//        int a = Integer.MAX_VALUE;

        int[] power = new int[2];
        int powerValue = 1000000000;

        System.out.println("Kết quả dùng powerValue: " + (powerValue * 2));// Một giá trị lớn
        power[1] = (powerValue * 2) % MOD;
        System.out.println("Kết quả dùng powerValueMOD: " + (power[1] + (powerValue ) % MOD));// Một giá trị lớn

        System.out.println("----------------");

        int targe = 9;
        System.out.println("numSubseq: "+numSubseq(new int[]{3, 5, 6, 7}, 9));

    }

    public static int numSubseq(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);

        int[] power = new int[n];
        power[0] = 1;

        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % MOD;
        }

        int left = 0, right = n - 1, result = 0;

        while (left <= right) {

            if (nums[left] + nums[right] <= target) {
                int temp = power[right - left] % MOD;
                int tempMOD = (result + temp) % MOD;
                result = tempMOD;

                /*
                int temp = power[right - left] % MOD;
                int result = (result + temp) % mod;
                 */
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

    private static int numSubseqV2(int[] nums, int target) {
        int n = nums.length, result = 0, right = n - 1, left = 0;

        Arrays.sort(nums);

        int[] power = new int[n];
        power[0] = 1;

        for (int i = 0 ; i < n; i++) {
            power[i] = (power[i - 1] * 2) % MOD;
        }

        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                int temp = power[right - left] % MOD;
                result = ( result + temp ) % MOD;
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}

