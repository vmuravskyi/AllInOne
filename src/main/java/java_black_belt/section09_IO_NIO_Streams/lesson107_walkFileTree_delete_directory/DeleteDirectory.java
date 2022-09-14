package java_black_belt.section09_IO_NIO_Streams.lesson107_walkFileTree_delete_directory;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class DeleteDirectory {

    public static void main(String[] args) throws IOException {

        Path destination = Paths.get("C:\\Users\\vmura\\OneDrive\\Desktop\\CopyHere");
        Files.walkFileTree(destination, new MyFileVisitor3());

    }

}

class MyFileVisitor3 extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Delete name: " + file.getFileName());
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Delete directory: " + dir);
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }

}
