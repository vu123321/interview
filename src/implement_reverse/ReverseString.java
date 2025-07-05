package implement_reverse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {

    public static void main(String[] args) {


        // TODO reverse
//        String s = "LeHoangVu";
//
//        String r = "";
//
//        char ch;
//
//        for(int i = 0; i < s.length(); i++) {
//            ch = s.charAt(i);
//
//            r =   ch + r;
//        }

//        System.out.println("r = "+r);



        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Geeks", "For"), Arrays.asList("GeeksForGeeks", "A computer portal"), Arrays.asList("Java", "Programming")
        );

        listOfLists.stream().flatMap(list -> list.stream()).forEach(string -> System.out.println(string));
        /*
            Geeks
            For
            GeeksForGeeks
            A computer portal
            Java
            Programming

         */

        // TODO
        listOfLists.stream().flatMap(list -> list.stream()).map( str -> str.charAt(2)).forEach(System.out::println);
        /*
            e
            G
            e
            g

         */

        List<Integer> primeNumber = Arrays.asList(5, 7 , 11, 13);
        List<Integer> oddNumber = Arrays.asList(1, 3 , 5);

        List<Integer> evenNumber = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListInts = Arrays.asList(primeNumber, oddNumber, evenNumber);

        System.out.println("the Structure before flattening is: " +listOfListInts);

        List<Integer> listOfInts = listOfListInts.stream().flatMap(list -> list.stream()).collect(Collectors.toList());

        System.out.println("The Structure after flattening is: " +listOfInts);


        List<List<String>> listOfListStrings = Arrays.asList(Arrays.asList("G", "E", "E")
                , Arrays.asList("K", "S", "F")
                , Arrays.asList("O", "R", "G")
                , Arrays.asList("E", "E", "K", "S"));

        List<String> listOfStrings = listOfListStrings.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println("The Structure of listOfStrings after flattening is: " +listOfStrings);
    }
}
