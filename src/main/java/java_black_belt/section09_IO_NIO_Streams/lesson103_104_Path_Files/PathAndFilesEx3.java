package java_black_belt.section09_IO_NIO_Streams.lesson103_104_Path_Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {

    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("PathAndFilesEx3.txt");
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        String dialog = "-Hello\n-Hello\n-How are you doing?\n-Great! How about you?\n-I'm doing well, thanks!";
        Files.write(filePath, dialog.getBytes());

        List<String> lines = Files.readAllLines(filePath);
        lines.forEach(System.out::println);

    }

}
