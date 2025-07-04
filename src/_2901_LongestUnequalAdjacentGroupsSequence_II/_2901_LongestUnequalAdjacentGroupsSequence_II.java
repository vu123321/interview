package _2901_LongestUnequalAdjacentGroupsSequence_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _2901_LongestUnequalAdjacentGroupsSequence_II {

    public static void main(String[] args) {


    }

    private static List<String> getWordsInLongestSub(String[] words, int[] groups) {

        int n = groups.length;
        int[] longestSubLength = new int[n];

        int[] previousIndex = new int[n];

        Arrays.fill(longestSubLength, 1);
        Arrays.fill(previousIndex, -1);

        int maxLength = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {

                if (groups[i] != groups[j] && longestSubLength[i] < longestSubLength[j] && canTransform(words[i], words[j])) {
                    longestSubLength[i] = longestSubLength[j] + 1;
                    previousIndex[i] = j;
                    maxLength = Math.max(maxLength, longestSubLength[i]);
                }
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (longestSubLength[i] == maxLength) {
                for (int j = i; j >= 0; j = previousIndex[j]) {
                    result.add(words[j]);
                }
                break;
            }
        }

        Collections.reverse(result);

        return result;
    }


    /**
     * Checks if one string can be transformed into another string by changing exactly one character.
     *
     * @param firstWord  The first string to be compared.
     * @param secondWord The second string to be compared.
     * @return A boolean indicating if the transformation is possible (true) or not (false).
     */
    private static boolean canTransform(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        int diffCount = 0;
        for (int i = 0; i < firstWord.length(); ++i) {
            if (firstWord.charAt(i) != secondWord.charAt(i)) {
                diffCount++;
            }
        }
        return diffCount == 1;
    }

    private static List<String> processV1(int n, String[] word, int[] groups) {
        int[] longestSubLength = new int[n];
        int[] previousSubLength = new int[n];
        Arrays.fill(longestSubLength, 1);
        Arrays.fill(previousSubLength, -1);

        int maxLength = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; i++) {
                if (groups[i] != groups[j + 1]
                        && longestSubLength[i] < longestSubLength[j]
                        && canTransform(word[i], word[j])) {

                    previousSubLength[i] = j;
                    maxLength = Math.max(maxLength, longestSubLength[i]);
                }
            }
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (maxLength == longestSubLength[i]) {
                for (int j = i; j >= 0; j = previousSubLength[j]) {
                    result.add(word[j]);
                }
                break;
            }
        }
        Collections.reverse(result);
        return result;
    }

    private static boolean canTransformV2(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }

        int diff = 0;
        for (int i = 0; i < firstWord.length(); i++) {
            if (firstWord.charAt(i) != secondWord.length()) {
                diff++;
            }
        }

        return diff == 1;
    }
}
