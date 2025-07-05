import java.util.HashMap;
import java.util.Map;

public class _2364_CountNumberOfBadPair {

    public static void main(String[] args) {

        System.out.println("res: " + countNumberOfPairs(new int[]{1, 1, 2, 1}));
    }


    public static long countNumberOfPairs(int[] nums) {
        long badPairs = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int pos = 0; pos < nums.length; pos++) {
            int diff = pos - nums[pos];
            int goodPairs = map.getOrDefault(diff, 0);

            badPairs += pos - goodPairs;
            map.put(diff, goodPairs + 1);

        }

        return badPairs;
    }
}
