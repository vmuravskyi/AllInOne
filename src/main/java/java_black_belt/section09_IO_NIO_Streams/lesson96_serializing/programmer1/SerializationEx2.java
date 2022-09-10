package java_black_belt.section09_IO_NIO_Streams.lesson96_serializing.programmer1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java_black_belt.section09_IO_NIO_Streams.lesson96_serializing.Car;
import java_black_belt.section09_IO_NIO_Streams.lesson96_serializing.Employee;

public class SerializationEx2 {

    public static void main(String[] args) {

        Car car = new Car("Grey", "Skoda Fabia");
        Employee employee = new Employee("Jack", "Jackson", "IT", 31, 99999, car);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employeeSerializable"))) {
            outputStream.writeObject(employee);
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
