package epam.javaIO.byteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputMain {
    public static void main(String[] args) {

        try (FileOutputStream output =
                     new FileOutputStream("src/main/java/epam/javaIO/data/out.txt", true)) {
            output.write(48);
            byte[] values = {65, 69, 100, 101, 127};
            output.write(values);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
