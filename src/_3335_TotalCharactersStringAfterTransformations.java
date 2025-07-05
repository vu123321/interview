public class _3335_TotalCharactersStringAfterTransformations {

    // TODO
    /* TODO
    You are given a string s and an integer t, representing the number of transformations to perform. In one transformation, every character in s is replaced according to the following rules:

    If the character is 'z', replace it with the string "ab".
    Otherwise, replace it with the next character in the alphabet. For example, 'a' is replaced with 'b', 'b' is replaced with 'c', and so on.
    Return the length of the resulting string after exactly t transformations.

    Since the answer may be very large, return it modulo 109 + 7.
     */
    public static void main(String[] args) {

        System.out.println(lengthAfterTransformations("abcyy", 2));
    }

    static long  MOD = (long) Math.pow(10, 9) + 7;

    public static int lengthAfterTransformations(String s, int t) {

        for (int i = 1; i <= t; i++) {

            String res = "";
            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) == 'z') {
                    res += "ab";
                } else {
                    char temp = s.charAt(j);
                    temp++;
                    res += temp;
                }

            }
            s = res;


        }
        return s.length();
    }

    public static int lengthAfterTransformationsV1(String s, int t) {

        for (int i = 1; i <= t; i++) {
            String res = "";
            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) == 'z') {
                    res += "ab";
                } else {
                    char temp = s.charAt(j);
                    temp++;
                    res += temp;
                }

            }
            s = res;


        }
        return s.length();
    }

    private static int lengthAfterTransformationV2(String s, int t) {


        int[]  countNumberTimes = new int[26];

        for(char c : s.toCharArray()) {
            ++countNumberTimes[c - 'a'];
        }

        for(int round = 1; round <=t ; round++) {
            int[] nextCount = new int[26];

            nextCount[0] = countNumberTimes[25];
            nextCount[1] = (int) ((countNumberTimes[25] + countNumberTimes[0]) % MOD);

            for(int i = 2; i < 26; i++) {
                nextCount[i] = countNumberTimes[i - 1];
            }
            countNumberTimes = nextCount;
        }


        int ans = 0;
        for(int i = 0 ; i < 26; i++) {
            ans = (int)((ans + countNumberTimes[i]) % MOD);
        }
        return ans;
    }
}
