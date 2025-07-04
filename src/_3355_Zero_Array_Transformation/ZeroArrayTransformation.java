package _3355_Zero_Array_Transformation;

public class ZeroArrayTransformation {

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 1};
        int[][] queries = {{1, 3}, {0, 2}};

        System.out.printf("result:" + isZeroArray(nums, queries));

    }

    private static boolean isZeroArray(int[] nums, int[][] queries) {
        int[] deltaArray = new int[nums.length + 1];
        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];
            deltaArray[left]++;

            if (right + 1 < nums.length) deltaArray[right + 1] -= 1;
        }

        int[] operationCounts = new int[deltaArray.length];
        int currentOperations = 0;

        for (int i = 0; i < deltaArray.length; i++) {
            currentOperations += deltaArray[i];
            operationCounts[i] = currentOperations;
        }

        for (int i = 0; i < nums.length; i++) {
            if (operationCounts[i] < nums[i]) {
                return false;
            }
        }

        return true;
    }
}
