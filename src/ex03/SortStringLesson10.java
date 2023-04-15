package ex03;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringLesson10 {

    public static void main(String[] args) {
        String[] strings = {"2", "-6", "10", "0", "11",
                null, "4", "8",
                null,
                "Special", "SpSocial",
                "a", "c",
                "b", "xx"};
        sortOfString(strings);
        printf(strings);

        System.out.println("\n=====================");

        String[] strings1 = {"2", "3", "-8", null, null, "5", "8", "Special", "SpSocial", "a", "c", "xx"};

        sortOfString(strings1);
        printf(strings1);
        System.out.println("\n=====================");
    }

    private static void sortOfString(String... strings1) {
        Arrays.sort(strings1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 == null) {
                    return 1;
                }
                if (o2 == null) {
                    return -1;
                }
                if (o1.equalsIgnoreCase("Special")) {
                    return 1;
                }
                if (o2.equalsIgnoreCase("Special")) {
                    return -1;
                }

                if (o1.matches("-?\\d{0,9}")) {
                    Integer i1 = Integer.parseInt(o1);
                    if (o2.matches("-?\\d{0,9}")) {
                        Integer i2 = Integer.parseInt(o2);
                        return i2.compareTo(i1);
                    }
                }
                return o2.compareTo(o1);
            }
        });
    }

    private static void printf(String... strings) {
        System.out.println();
        for (String str : strings) {
            System.out.print(str + ", ");
        }
    }

}

/**
 * Arrays.sort(strings, (s1, s2) -> {
 * <p>
 * if (s1 == null) {
 * return -1;
 * }
 * if (s2 == null) {
 * return 1;
 * }
 * if (s1.equalsIgnoreCase("Special")) {
 * return -1;
 * }
 * if (s2.equalsIgnoreCase("Special")) {
 * return 1;
 * }
 * // number , string
 * // s1:
 * // s2:\
 * // Number or negative number
 * if (s1.matches("-?\\d{0,9}")) { // -?\d{0,9} dấu - ?  có dấu trừ cũng được và 0 đến 9 kí tự.
 * Integer i1 = Integer.parseInt(s1);
 * if (s2.matches("-?\\d{0,9}")) {
 * Integer i2 = Integer.parseInt(s2);
 * return i1.compareTo(i2);
 * }
 * }
 * return s1.compareTo(s2);
 * });
 * System.out.println("===============");
 * <p>
 * printf(strings);
 */
