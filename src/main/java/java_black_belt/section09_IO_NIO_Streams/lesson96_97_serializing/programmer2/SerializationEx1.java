package java_black_belt.section09_IO_NIO_Streams.lesson96_97_serializing.programmer2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {

    public static void main(String[] args) {

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees1.bin"))) {
            List<String> employees = (ArrayList) inputStream.readObject();
            System.out.println(employees);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
