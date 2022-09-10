package java_black_belt.section09_IO_NIO_Streams.lesson96_97_serializing.programmer2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java_black_belt.section09_IO_NIO_Streams.lesson96_97_serializing.Employee;

public class SerializationEx2 {

    public static void main(String[] args) {

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employeeSerializable"))) {
            var object = (Employee) inputStream.readObject();
            System.out.println(object.toString());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
