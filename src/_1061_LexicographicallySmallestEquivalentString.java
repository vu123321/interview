import java.util.Stack;

public class _1061_LexicographicallySmallestEquivalentString {


    public static void main(String[] args) {

//        String s1 = "parker", s2 = "morris", baseStr = "parser";
//
//        System.out.println(smallestEquivalentString(s1, s2, baseStr));


    }

    private static String robotWithString(String s) {

        System.out.println("---------");

        s = "banana"; // Chuỗi cần đếm ký tự
        int[] cnt = new int[26]; // Mảng đếm cho 26 ký tự

        // Duyệt qua từng ký tự trong chuỗi s
        for (char c : s.toCharArray()) {
            // Tính chỉ số và tăng số lần xuất hiện
            cnt[c - 'a']++;
        }

        // In kết quả
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        char minChar = 'a';

        for(char a : s.toCharArray()) {

            stack.push(a);
            cnt[a - 'a']--;
            while(minChar != 'z' && cnt[minChar - 'a'] == 0) {
                minChar++;
            }

            while(!stack.isEmpty() && stack.peek() <= minChar) {
                res.append(stack.pop());
            }
        }
        return res.toString();
    }

    public static int[] parent;
    public static String smallestEquivalentString(String s1, String s2, String baseStr) {

        parent = new int[26];
        for (int i = 0; i < 26; ++i) {
            parent[i] = i;
        }

        // Process the mappings in s1 and s2
        for (int i = 0; i < s1.length(); ++i) {
            // Convert the characters to zero-based indices
            int indexS1 = s1.charAt(i) - 'a';
            int indexS2 = s2.charAt(i) - 'a';

            // Find the parents for both indices
            int parentS1 = find(indexS1);
            int parentS2 = find(indexS2);

            // Union the parents by rank
            if (parentS1 < parentS2) {
                parent[parentS2] = parentS1;
            } else {
                parent[parentS1] = parentS2;
            }
        }

        for(int i = 0; i < parent.length; i++) {
            System.out.println("parent["+i+"] = "+parent[i]);
        }
        StringBuilder result = new StringBuilder();
        for (char ch : baseStr.toCharArray()) {
            // Translate the base characters according to the smallest parent character
            char smallestEquivalentChar = (char) (find(ch - 'a') + 'a');
            result.append(smallestEquivalentChar);
        }
        return result.toString();
    }

    public static int find(int x) {
        // Path compression: Update the parent along the search path
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
}
