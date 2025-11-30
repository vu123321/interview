package coding;
public class _1437kLengthApart {
public boolean kLengthApart(int[] nums, int k) {
        int lastIndex = -1;
        for (int o = 0; o < nums.length; o++) {
            if (nums[o] == 1) {
                if (lastIndex != -1 && o - lastIndex - 1 < k) {
                    return false;
                }
                lastIndex = o;
            }
        }
        return true;
    }
}
