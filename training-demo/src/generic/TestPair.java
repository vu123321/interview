package generic;

import comparable_and_comparator_interfaces.Test;

import java.io.Serializable;
import java.text.Format;
import java.util.*;

public class TestPair {

    public static void main(String[] args) {
        List<Pair<Serializable, Object>> list = getAll();
        list.forEach(System.out::println);

        System.out.println("=======================");

        Book<Integer> integerBook = new Book<>(100000);
        Book<String> stringBook = new Book<>("le hoang vu ");
        Book<Double> stringBook1 = new Book<>(10.2D);
        Book<Float> stringBook2 = new Book<>(2.3F);
        Book<Character> stringBook3 = new Book<>('c');

        List<Object> listO = new ArrayList<>();
        listO.add(integerBook);
        listO.add(stringBook);
        listO.add(stringBook1);
        listO.add(stringBook2);
        listO.add(stringBook3);
        printf(listO);
    }
    private static <E> void printf(List<E> e){
        for (E e1 : e) {
            System.out.println(e1);
        }
    }
    private static List<Pair<Serializable, Object>> getAll() {
        return Arrays.asList(new Pair<>("le hoang vu", 2022),
                new Pair<>("le hoang vu", 2022),
                new Pair<>("le hoang vu", 2022),
                new Pair<>("le hoang vu", 2022),
                new Pair<>("le hoang vu", 2022),
                new Pair<>("le hoang vu", 2022));
    }
}
