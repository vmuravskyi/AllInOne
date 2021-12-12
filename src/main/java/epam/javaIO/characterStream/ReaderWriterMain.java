package epam.javaIO.characterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ReaderWriterMain {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("src/main/java/epam/javaIO/data/info.txt");
             FileWriter writer = new FileWriter("src/main/java/epam/javaIO/data/out2.txt", true)) {
            int symbol = reader.read();
            writer.write(symbol);
            System.out.println(symbol);
            char[] buffer = new char[12];
            int charNum = reader.read(buffer);
            while (charNum != -1) {
                writer.write(buffer, 0, charNum);
                charNum = reader.read(buffer);
            }
            System.out.println(Arrays.toString(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
