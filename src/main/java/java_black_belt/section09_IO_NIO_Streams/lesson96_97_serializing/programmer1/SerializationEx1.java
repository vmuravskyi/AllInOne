package java_black_belt.section09_IO_NIO_Streams.lesson96_97_serializing.programmer1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {

    public static void main(String[] args) {

        // ObjectOutputStream used for serializing objects

        List<String> employees = new ArrayList<>();
        employees.add("Volodymyr");
        employees.add("John");
        employees.add("Oliver");
        employees.add("Andrzej");
        employees.add("Piotr");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees1.bin"))) {
            outputStream.writeObject(employees);
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
