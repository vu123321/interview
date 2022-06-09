import org.w3c.dom.ls.LSException;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class App {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("a ");
        strings.add("b ");
        strings.add("c");
        strings.add("d ");
        strings.add("e ");
        strings.add("f ");

        strings.stream() // Convert collection to Stream
                .map(String::toUpperCase).forEach(System.out::println);
        System.out.println("====================");
        Stream.of(1, 2, 3, 4, 5)
                .peek(i -> System.out.printf("%d ", i))
                .map(i -> i * i)
                .peek(i -> System.out.printf("%d ", i))
                .count();

    }
}

