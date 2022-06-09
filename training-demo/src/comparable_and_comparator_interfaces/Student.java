package comparable_and_comparator_interfaces;

import java.util.Comparator;

public class Student{
    private Integer id;
    private String name;
    private Double cgpa;

    public Student() {
    }

    public Student(Integer id, String name, Double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    //
//    @Override
//    public int compare(Student o1, Student o2) {
//        return o1.id - o2.id;
//    }
}
