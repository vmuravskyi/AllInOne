package java_black_belt.section09_IO_NIO_Streams.lesson103_104_Path_Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx2 {

    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("PathAndFilesEx1.txt");
        Path directoryPath = Paths.get("C:\\Users\\vmura\\OneDrive\\Desktop\\TestFolder");
        Path directoryBPath = Paths.get("C:\\Users\\vmura\\OneDrive\\Desktop\\TestFolder2");

//        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(filePath, directoryPath.resolve("myCustomFilename.txt"));
//        Files.copy(directoryBPath, directoryPath.resolve("B")); // copy with replacing the name of the folder, will copy without its content

//        Files.move(filePath, directoryPath.resolve("testMovedFile.txt"));

//        Files.move(Paths.get("test1123123123121.txt"), Paths.get("test1123123123121Renamed.txt")); // rename file

        Files.deleteIfExists(directoryBPath);

    }

}
