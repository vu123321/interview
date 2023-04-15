package ex01;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class removeDuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = randomInteger();
        int[] digits = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            digits[i] = list.get(i);
        }
        System.out.println("------------ 1 ------------");
        for (int i = 0; i < digits.length; i++) {
            System.out.println("arr[ " + i + " ] = " + digits[i]);
        }

        System.out.println("------removeDuplicateElements------");
        System.out.println(Arrays.toString(distinct(digits).toArray()));
        System.out.println("------insertionSort------");
        insertionSort(digits);
        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        System.out.println("\n------thirdMax-------");
        int count = 0;
        int max = digits[digits.length - 1];
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < max) {
                count++;
                max = digits[i];
                if (count == 2) {
                    System.out.println("third max: " + digits[i]);
                    break;
                }
            }
        }
        System.out.println("\n ============= Third Max used Set : =============");
        // Third max used Set<Integer>
        // int[] digit => List<Integer>
        List<Integer> sortedList = new ArrayList<>();

        for (int value : digits) {
            sortedList.add(value);
        }
        Set<Integer> set = new LinkedHashSet<>(sortedList);
        for (Integer item : set) {
            System.out.print(item + ", ");
        }
        sortedList = new ArrayList<>(set);
        System.out.println("\nThird Max = " + sortedList.get(sortedList.size() - 3));

        System.out.println("========Reduce=========");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
                .stream()
                .reduce(0, Integer::sum);
        System.out.print(result + " ,");


    }

    //        for (int digit : digits) {
//            if (!map.containsKey(digit)){
//                map.put(digit,1);
//            }else {
//                int value = map.get(digit);
//                map.put(digit,value + 1);
//            }
//        }
    private static List<Integer> distinct(int[] digits) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer digit : digits) {
            map.put(digit,
                    map.containsKey(digit)
                            ? map.get(digit) + 1
                            : 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    private static List<Integer> getList(){
        return new ArrayList<>();
    }


    private static List<Integer> copyDistinct(int ... arr){
        List<Integer> result  = getList();
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer integer : arr ) {
            map.put(integer,map.containsKey(integer) ? map.get(integer) + 1 : 1);
        }

        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            if (entry.getValue() == 1){
                result.add(entry.getKey());
            }
        }
        return  result;
    }

    private static List<Integer> randomInteger() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int ranNum = ThreadLocalRandom.current().nextInt(1, 101);
            result.add(ranNum);
        }
        return result;
    }

    private static void insertionSort(int... digit) {
        int posToInsert;
        int valToInsert;
        for (int i = 0; i < digit.length; i++) {
            valToInsert = digit[i];
            posToInsert = i;

            // Shift , pes position to insert
            while (posToInsert > 0 && digit[posToInsert - 1] > valToInsert) {
                digit[posToInsert] = digit[posToInsert - 1];
                posToInsert--;
            }
            if (posToInsert != i) {
                digit[posToInsert] = valToInsert;
            }
        }
    }
}
