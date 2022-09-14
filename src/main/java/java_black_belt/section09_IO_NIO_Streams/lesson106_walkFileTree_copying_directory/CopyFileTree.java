package java_black_belt.section09_IO_NIO_Streams.lesson106_walkFileTree_copying_directory;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {

    public static void main(String[] args) throws IOException {

        Path source = Paths.get("C:\\Users\\vmura\\OneDrive\\Desktop\\X");
        Path destination = Paths.get("C:\\Users\\vmura\\OneDrive\\Desktop\\CopyHere");

        Files.walkFileTree(source, new MyFileVisitor2(source, destination));
        System.out.println("Done");

    }

}

class MyFileVisitor2 extends SimpleFileVisitor<Path> {

    Path source;
    Path destination;

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

}
