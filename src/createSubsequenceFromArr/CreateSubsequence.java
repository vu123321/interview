package createSubsequenceFromArr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateSubsequence {

    public static void main(String[] args) {

        var subArr = splitArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9 }, 4);

        int[] maxSumSubArr = findMaxSumOfSubArr(subArr);

        if (maxSumSubArr != null) {
            System.out.print("Subarray with the highest sum: [ ");
            for (int num : maxSumSubArr) {
                System.out.print(num + " ");
            }
            System.out.println("]");
        }
    }

    private static int[] findMaxSumOfSubArr(List<int[]> subArrays) {
        int[] maxSubArrays = null;
        int maxSum = Integer.MIN_VALUE;

        for (int[] subArr : subArrays) {
            int sum = 0;
            for (int num : subArr) {
                sum += num;
            }

            if(sum > maxSum) {
                maxSum = sum;
                maxSubArrays = subArr;
            }
        }
        return maxSubArrays;
    }

    private static List<int[]> splitArray(int[] arr, int k) {
        List<int[]> result = new ArrayList<>();
        int n = arr.length;

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k");

            return result;
        }

        for (int i = 0; i < n; i++) {
            int length = Math.min(k , n - i);
            int[] subArray = new int[length];

            if (length < k) break;
            System.arraycopy(arr, i , subArray, 0,  length);
            int sum = 0;

            result.add(subArray);
        }

        return result;
    }
}
