package java_black_belt.section09_IO_NIO_Streams.lesson96_serializing;

import com.google.common.base.MoreObjects;
import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 6679459930831042272L;

    private String name;
    private String surname;
    private String department;
    private int age;
    private transient double salary;
    private Car car;

    public Employee(String name, String surname, String department, int age, double salary, Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("name", name)
            .add("surname", surname)
            .add("department", department)
            .add("age", age)
            .add("salary", salary)
            .add("car", car)
            .toString();
    }

}
