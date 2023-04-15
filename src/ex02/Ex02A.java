package ex02;

public class Ex02A {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 9, 0, 9},
                {2, 9, 6, 5},
                {1, 2, 4, 5},
        };

        // cách 2;
        for (int row = 0; row < a.length; row++) {
            int rp = -1;
            int cp = -1;
            for (int col = 0; col < a[0].length; col++) {
                if (a[row][col] == 0) {
                    rp = row;
                    cp = col;
                    break;

                }
            }
            if (rp != -1) {
                // set row value = 0
                for (int zeroRow = 0; zeroRow < a.length; zeroRow++) {
                    a[zeroRow][cp] = 0;
                }
                // set column value = 0
                for (int zeroCol = 0; zeroCol < a[0].length; zeroCol++) {
                    a[rp][zeroCol] = 0;
                }
                break;
            }
        }

        print(a);
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
