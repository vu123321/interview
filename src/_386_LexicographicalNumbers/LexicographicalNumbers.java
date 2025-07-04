package _386_LexicographicalNumbers;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {

    public static void main(String[] args) {


        List<Integer> result = new ArrayList<>();
        int n = 500;

        lexicalOrder(n, result).stream().forEach(s -> System.out.print(" "+s));


    }

    public static List<Integer> lexicalOrder(int n, List<Integer> result) {

        for (int i = 1; i <= 9 ; i++) {
            if (i <= n) {
                recurse( i, n, result);
            }
        }

        return result;
    }

    public static void recurse(int current, int n, List<Integer> result) {
        result.add(current);

        for(int i = 0; i <= 9; i++) {
            int next = current * 10 + i;

            System.out.println("next: "+next);
            if (next <= n) {
                recurse(next, n , result);
            }
        }
    }
}
