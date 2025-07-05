package _1397_FindLuckyInteger;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyInteger {

    public static void main(String[] args) {

        FindLuckyInteger findLuckyInteger = new FindLuckyInteger();
        int[] arr = {1, 2, 2, 3, 3, 3};
        int result = findLuckyInteger.findLucky(arr);
        System.out.println("result= "+result);
    }

    private int findLucky(int[] arr) {

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            frequency.put(arr[i], frequency.getOrDefault(arr[i], 0) + 1);
        }
        int result = -1;
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {

            if (entry.getKey() == entry.getValue()) {

                result = Math.max(entry.getKey(), entry.getValue());
            }
        }

        return result > 0 ? result : -1;
    }
}
