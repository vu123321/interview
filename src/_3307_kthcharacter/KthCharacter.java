package _3307_kthcharacter;

public class KthCharacter {

    public static void main(String[] args) {

    }

    private static char kthCharacter(long k, int[] operation) {
        return solve(k, operation, operation.length);
    }

    private static char solve(long k, int[] operation, int n) {

        char result = 'a';

        while (n > 0) {
            long left = 1;
            long right = (long) Math.pow(2, n);
            long mid = left + (right - left) / 2;
            int flip = operation[n - 1];

            if ( k <= mid) {
                n--;
            } else {
                k = k - mid;
                if (flip == 1) {
                    result = result == 'z' ? 'a' : (char) (result + 1);

                }
                n --;
            }
        }
        return result;
    }
}
