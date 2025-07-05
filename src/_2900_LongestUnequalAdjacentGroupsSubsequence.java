import java.util.ArrayList;
import java.util.List;

public class _2900_LongestUnequalAdjacentGroupsSubsequence {

    public static void main(String[] args) {

    }

    private static List<String> longestUnequalAdjacentGroupsSub(String[] s, int [] groups) {

        List<String> result = new ArrayList<>();

        for(int i = 0; i < s.length; i++) {
            if(i == 0 || groups[i] != groups[i - 1]) {
                result.add(s[i]);
            }
        }

        return result;

    }

    private static List<String> longestUnequalAdjacentGroupsSubsequence(String[] s, int[] groups) {
        List<String> result = new ArrayList<>();
         int pre = -1;
        for(int i = 0; i < s.length; i++) {
            if(pre != groups[i]) {
                pre = groups[i];
                result.add(s[i]);
            }
        }
        return result;
    }

    private static ArrayList<Object> processV1(String [] s, int[] groups) {
        var result = new ArrayList<>();

        for(int i = 0 ; i < groups.length; i++) {
            if(i == 0 || groups[i] != groups[i - 1]) {
                result.add(s[i]);
            }
        }

        return result;
    }

    private static List<String> processVersion2(int[] groups, String[] words) {
        List<String> result = new ArrayList<>();
        int pre = -1;
        for (int i = 0; i < words.length; i++) {
            if( pre != groups[i]) {
                result.add(words[i]);
            }
        }

        return result;

    }

    /*

        khai bao 1 list<String> result
        loop qua mang String or mang groups
        check : if  groups[i] != groups[i - 1] -> result.add((words[i)
        return result;


     */
}
