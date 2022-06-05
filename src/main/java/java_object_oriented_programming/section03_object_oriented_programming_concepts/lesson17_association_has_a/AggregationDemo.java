package java_object_oriented_programming.section03_object_oriented_programming_concepts.lesson17_association_has_a;

import java.util.ArrayList;
import java.util.List;

class College {
    private String name;
    private List<Teacher> teachers;

    public College(String name, List<Teacher> teachers) {
        this.name = name;
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}

class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return String.format("Teacher: %s, Subject: %s]", name, subject);
    }
}

public class AggregationDemo {

    public static void main(String[] args) {

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Ron", "Java"));
        teachers.add(new Teacher("John", "Python"));

        College college = new College("MyCollege", teachers);

    }

}
