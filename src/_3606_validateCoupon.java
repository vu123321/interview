import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _3606_Version_2 {
    public static void main(String[] args) {

//        String[] code = {"SAVE20", "", "PHARMA5", "SAVE@20"};
//        String[] businessLine = {"restaurant", "grocery", "pharmacy", "restaurant"};
//        boolean[] isActive = {true, true, true, true};

//        String[] code = {"GROCERY15", "ELECTRONICS_50", "DISCOUNT10"};
//        String[] businessLine = {"grocery", "electronics", "invalid"};
//        boolean[] isActive = {false, true, true};

//        String[] code = {"3yJeH11","JTGbMmQ"};
//        String[] businessLine = {"electronics","pharmacy"};
//        boolean[] isActive = {false,false};

        String[] code = {"V", "M"};
        String[] businessLine = {"pharmacy", "invalid"};
        boolean[] isActive = {true, false};

        validateCouponV2(code, businessLine, isActive).forEach(System.out::println);
    }


    private static List<String> validateCouponV2(String[] code, String[] businessLine, boolean[] isActive) {

        List<String>[] groups = new ArrayList[4];

        for (int index = 0; index < 4; index++) {
            groups[index] = new ArrayList<>();
        }

        for (int index = 0; index < code.length; index++) {
            if (!code[index].isEmpty() && check(code[index], isActive[index])) {
                if (businessLine[index].equals("electronics")) {
                    groups[0].add(code[index]);
                } else if (businessLine[index].equals("grocery")) {
                    groups[1].add(code[index]);

                } else if (businessLine[index].equals("pharmacy")) {
                    groups[2].add(code[index]);

                } else if (businessLine[index].equals("restaurant")) {
                    groups[3].add(code[index]);

                }
            }
        }

        List<String> ans = new ArrayList<>();

        for (List<String> group : groups) {
            Collections.sort(group);
            ans.addAll(group);
        }
        return ans;

    }

    private static boolean check(String code, boolean isActive) {
        for (char ch : code.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != '_') {
                return false;
            }
        }
        return isActive;
    }
}
