package comparable_and_comparator_interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test   {

    public static void main(String[] args) {
        List<Student> students = getAll();

        students.sort((o1, o2) -> (int) (o1.getCgpa() - o2.getCgpa()));
        students.forEach(System.out::println);
        System.out.println("--------------------");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getId().compareTo(o1.getId());
            }
        });
        students.forEach(System.out::println);
    }
    public static List<Student> getAll() {
        return Arrays.asList(new Student(1, "A", 10.6D),
                new Student(2, "A", 13.6D),
                new Student(4, "B", 199.6D),
                new Student(4, "B", 33.D),
                new Student(4, "B", 555.D),
                new Student(5, "G", 10.6D),
                new Student(6, "S", 55.6D),
                new Student(7, "N", 11.6D));
    }


}
