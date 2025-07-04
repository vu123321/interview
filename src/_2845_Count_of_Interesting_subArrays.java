import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2845_Count_of_Interesting_subArrays {

    public static void main(String[] args) {
        System.out.println("result: "+processV1(Arrays.asList(3,2,4), 2, 1));
    }


    private static long processV1(List<Integer> nums, int modulo, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        long count = 0;

        int interestingCount = 0;

        for(int  i = 0 ; i < nums.size(); i++) {

            if(nums.get(i) % modulo == k) {
                interestingCount++;
            }

            int moduloValue = interestingCount % modulo;
            count += map.getOrDefault(moduloValue, 0);

            map.put(moduloValue, map.getOrDefault(moduloValue, 0) + 1);

        }

        return count;
    }


}
