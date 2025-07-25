package _3403_FindTheLexicographicallyLargestStringFromBox;

public class Solution {

    public static void main(String[] args) {

        String word = "dbca"; int numFriends = 2;

        System.out.println(answerString(word, numFriends));


    }

    private static String answerString(String word, int numFriends) {
        if (numFriends == 1) {
            return word;
        }
        int n = word.length();
        String res = "";
        for (int i = 0; i < n; i++) {
            String s = word.substring(i, Math.min(i + n - numFriends + 1, n));
            if (res.compareTo(s) <= 0) {
                res = s;
            }
        }
        return res;
    }
}
