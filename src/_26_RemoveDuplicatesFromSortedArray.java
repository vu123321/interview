import java.util.HashMap;
import java.util.Map;

public class _26_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int [] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        int[] arr = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (i < arr.length) {
                arr[i] = entry.getKey();
                i++;
                System.out.println(arr[i]);
            }
        }


         return arr.length;
    }

}
