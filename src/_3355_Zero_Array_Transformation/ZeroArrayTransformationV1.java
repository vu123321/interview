package _3355_Zero_Array_Transformation;

public class ZeroArrayTransformationV1 {

    public static void main(String[] args) {

        int[] nums = {3, 2, 4};
        int[][] queries = {{0, 1}, {1, 2}};

        System.out.println("resultIsZeroArray:" + isZeroArray(nums, queries));

        System.out.println("resultWithFuncProcess:" + processV1(nums, queries));


    }

    private static boolean processV1(int[] nums, int[][] queries) {
        int sum = 0;

        for (int i = 0; i < queries.length; i++) {
            for (int start = queries[i][0], end = queries[i][1]; start < end; start++) {

                if (nums[i] > 0) {
                    nums[i]--;
                }
            }

        }

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum == 0;
    }

    private static boolean isZeroArray(int[] nums, int[][] queries) {
        int[] arr = new int[nums.length + 1];

        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];

            arr[left]++;
            if (right + 1 < nums.length) arr[right + 1]--;
        }

        int[] operationCounts = new int[arr.length];

        int currCounts = 0;

        for (int i = 0; i < arr.length; i++) {
            currCounts += arr[i];
            operationCounts[i] = currCounts;
        }

        for (int i = 0; i < nums.length; i++) {
            if (operationCounts[i] < nums[i]) {
                return false;
            }
        }
        return true;
    }
}