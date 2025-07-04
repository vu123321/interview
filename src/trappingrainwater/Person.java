package trappingrainwater;

import java.util.Map;
import java.util.function.Function;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public static Function<Person, ? extends Comparable> getFieldFunction(String fieldName) {
        Map<String, Function<Person, ? extends Comparable>> fieldMap = Map.of("name",
                Person::getName,
                "age", Person::getAge);
        Function<Person, ? extends Comparable> fieldFunction = fieldMap.get(fieldName);
        if (fieldFunction == null) {
            throw new IllegalArgumentException("Invalid field name: " + fieldName);
        }
        return fieldFunction;
    }

    public static void main(String[] args) {
        Person Alice = new Person("Alice", 30);

        Person alex = new Person("alex", 30);
        // Example usage
        Function<Person, ? extends Comparable> nameFunction = getFieldFunction("name");
        Function<Person, ? extends Comparable> ageFunction = getFieldFunction("age");
        String name = (String) nameFunction.apply(Alice);
        int age = (int) ageFunction.apply(Alice);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


