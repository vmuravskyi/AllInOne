package java_black_belt.section09_IO_NIO_Streams.lesson92_try_with_resources;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesEx {

    public static void main(String[] args) {

        // FileReader and FileWriter are used to work with text files
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader("src/main/resources/data/rubai.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                sb.append((char) character);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sb);
    }

}
