package ex02;

import java.util.HashSet;
import java.util.Set;

public class Ex02B {
    public static void main(String[] args) {

        int[][] digits = {
                {1, 2, 3, 4},
                {0, 6, 7, 8},
                {1, 9, 0, 9},
                {2, 9, 6, 5},
                {1, 2, 4, 0},
        };
        print(digits);
        System.out.println("================");
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        for (int row = 0; row < digits.length; row++) {
            for (int col = 0; col < digits[0].length; col++) {
                if (digits[row][col] == 0) {
                    rows.add(row);
                    cols.add(col);
                }
            }
        }

        for (int row = 0; row < digits.length; row++) {
            for (int col = 0; col < digits[0].length; col++) {
                if (rows.contains(row) || cols.contains(col)) {
                    digits[row][col] = 0;

                }
            }
        }

        print(digits);
    }

    private static void print(int[][] a) {
        for (int[] ints : a) {
            for (int column = 0; column < a[0].length; column++) {
                System.out.print(" " + ints[column] + " ");
            }
            System.out.println();
        }
    }
}
