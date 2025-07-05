package createSubsequenceFromArr;

import java.util.Arrays;
import java.util.Comparator;

import java.util.concurrent.CountedCompleter;

public class SortAndCompareValues {

    private static final int MIN_PARALLEL_SORT_SIZE = 4 << 10;

    public static void main(String[] args) {
        int[] arr = {1, 2, 88, 44, 66, 6, 5, 8, 9, 10};

        int[][] val = new int[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            val[i][0] = i;
            val[i][1] = arr[i];
        }

        Arrays.stream(val).forEach(s -> System.out.print(s+ " "));

        Arrays.sort(arr);
        Arrays.stream(arr).forEach(s -> System.out.print(s+ " "));

    }

}

