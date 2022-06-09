package comparable_and_comparator_interfaces;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SourceStream {
    public static void main(String[] args) {
      Arrays.stream(IntStream.range(5, 5666).toArray()).limit(10).forEach(System.out::println);
        System.out.println("----------------------");

        IntStream.iterate(-3, i -> i + 22).limit(5).forEach(System.out::println);
        System.out.println("----------------------");

//        new Random(10).doubles().limit(10).forEach(System.out::println);
        System.out.println("----------------------a");


        IntStream.rangeClosed(3,20).filter(i -> i % 2 == 0).map(i -> i + 20).forEach(System.out::println);

        System.out.println("----------------------a");

        IntStream chars = "aaaaaaaaaaaaab   bbbbbbbdddbbbbbbbb".chars();
//        System.out.println(chars.count());
        chars.distinct().sorted().forEach(ch -> System.out.printf("%c ", ch));
    }
}
