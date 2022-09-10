package java_black_belt.section09_IO_NIO_Streams.lesson94_FileInputStream_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx {

    public static void main(String[] args) {

        // FileInputStream is used for reading and writing binary files
        try (FileInputStream input = new FileInputStream("picture.png");
            FileOutputStream output = new FileOutputStream("src/main/resources/data/picture.png")) {
            int i;
            while ((i = input.read()) != -1) {
                output.write(i);
            }
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
