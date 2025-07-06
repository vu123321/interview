package _1865;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1865_FindingPairsWithACertainSum {

    public static class  FindSumPairs {
        List<int[]> sumPairs;

        int count ;

        int[] n1, n2;



        int[] add;

        public FindSumPairs(List<int[]> sumPairs, int count, int[] add) {
            this.sumPairs = sumPairs;
            this.count = count;
            this.add = add;
        }
        public FindSumPairs(int[] n1, int[] n2) {
            this.n1 = n1;
            this.n2 = n2;
        }
    }

    int [] n1 , n2;
    Map<Integer, Integer> cnt = new HashMap<>();

    public void FindSumPairs(int[] nums1, int[] nums2) {
        n1 = nums1;
        n2 = nums2;
        for(int number : n2 ) {
            cnt.put(number, cnt.getOrDefault(number, 0) + 1);
        }
    }


    public void add(int index, int val) {

        //
        cnt.put(n2[index], cnt.get(n2[index]) - 1);
        n2[index] += val;

        cnt.put(n2[index], cnt.getOrDefault(n2[index], 0) + 1);
    }

    public int count(int tot) {
        int c = 0;
        for (int x : n1 ) {
            c += cnt.getOrDefault(tot - x, 0);
        }
        return c;
    }
}
