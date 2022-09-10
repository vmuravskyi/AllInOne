package java_black_belt.section09_IO_NIO_Streams.lesson91_FileReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class FileReaderEx {

    public static void main(String[] args) throws IOException {

        // FileReader and FileWriter are used to work with text files
        FileReader reader = null;

        StringBuilder sb = new StringBuilder();
        try {
            reader = new FileReader("src/main/resources/data/rubai.txt");
            int character;
            while ((character = reader.read()) != -1) {
                sb.append((char) character);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            Objects.requireNonNull(reader).close();
        }
        System.out.println(sb);

    }

}
