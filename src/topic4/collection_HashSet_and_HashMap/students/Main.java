package topic4.collection_HashSet_and_HashMap.students;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    Map<Student, String> studentMap = new HashMap<>();

    public static void main(String[] args) {
        Student student1 = new Student("Петров", "4101", "111");
        Student student2 = new Student("Иванов", "4102", "112");
        Student student3 = new Student("Петров", "4101", "111");

        //Map<Student, String> studentMap = new HashMap<>();

    }

    public void addStudents(Student student) {
        System.out.println("12123");
    }
}