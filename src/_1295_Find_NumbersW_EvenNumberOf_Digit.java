import java.util.HashMap;
import java.util.Map;

public class _1295_Find_NumbersW_EvenNumberOf_Digit {


    public static void main(String[] args) {
        System.out.println("result :" + processV1(new int[]{12, 345, 2, 6, 7896}));

        System.out.println("processV2: " + processV2(new int[]{3, 2, 3, 2, 2, 2}));
    }

    private static int processV1(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

               if(String.valueOf(nums[i]).length() % 2 == 0) {
                   count++;
               }
        }

        return count;

    }

    private static boolean processV2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() % 2 != 0) {
                return false;
            }
        }

        return true;

    }
}
