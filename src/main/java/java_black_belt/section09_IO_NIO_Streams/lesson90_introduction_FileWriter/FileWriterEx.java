package java_black_belt.section09_IO_NIO_Streams.lesson90_introduction_FileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class FileWriterEx {

    public static void main(String[] args) throws IOException {

        // // FileReader and FileWriter are used to work with text files

        String rubai = "The plates will still shift \n"
            + "and the clouds will still spew. \n"
            + "The sun will slowly rise \n"
            + "and the moon will follow too.";

        FileWriter writer = null;
        try {
            writer = new FileWriter("src/main/resources/data/rubai.txt", true);
//            writer.write(rubai);
            String s = "\nHello";
            writer.write(s);
            log.info("Done saving a file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            Objects.requireNonNull(writer).close();
        }

    }

}
