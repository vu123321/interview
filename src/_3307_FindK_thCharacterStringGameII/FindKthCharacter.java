package _3307_FindK_thCharacterStringGameII;

public class FindKthCharacter {

    public static void main(String[] args) {

        int[] oper = {0, 1, 0, 1};
        Long k = 10L;

        System.out.println("ans= "+kthCharacter(k, oper));
    }

    private static char kthCharacter(long k, int[] operation) {

        int ans = 0;
        int t;

        while (k != 1) {
            System.out.println("------------");
            System.out.println("numberOfLeadingZeros= " + Long.numberOfLeadingZeros(k));

            t = 63 - Long.numberOfLeadingZeros(k);

            System.out.println("t= " + t);

            if ((1L << t) == k) {
                t--;
            }
            k = k - (1L << t);
            if (operation[t] != 0) {
                ans++;
            }
        }

        return (char) ('a' + (ans % 26));
    }
}
