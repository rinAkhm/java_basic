package topic4.collection_HashSet_and_HashMap.students;

import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private String studentId;

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
    @Override
    public String toString() {
        return "Имя: " +name +", Группа: " + group+ ", номер студенческого: "+studentId;
    }
}
