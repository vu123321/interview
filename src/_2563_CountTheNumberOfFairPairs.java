import java.util.Arrays;
import java.util.Scanner;

public class _2563_CountTheNumberOfFairPairs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lower = 3;
        int upper = 6;
        int[] nums = {0, 1, 7, 4, 4, 5};
        long result = countFairPairs(nums, 3, 6);
        System.out.println("result: " + result);
    }

    public static long countFairPairs(int[] nums, int lower, int upper) {

        Arrays.sort(nums);

        return lower_pound(nums, upper + 1) - lower_pound(nums, lower);
    }


    static long lower_pound(int[] nums, int value) {
        int left = 0, right = nums.length - 1;
        long result = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum < value) {
                result += right - left;
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
