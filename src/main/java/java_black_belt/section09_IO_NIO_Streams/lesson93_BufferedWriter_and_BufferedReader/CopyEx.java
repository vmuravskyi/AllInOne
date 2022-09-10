package java_black_belt.section09_IO_NIO_Streams.lesson93_BufferedWriter_and_BufferedReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyEx {

    public static void main(String[] args) {

        // FileReader and FileWriter are used to work with text files
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/data/test2.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/data/test3.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
