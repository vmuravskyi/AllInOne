package java_black_belt.section09_IO_NIO_Streams.lesson98_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {

    public static void main(String[] args) {

        // RandomAccessFile used to read and write from any point in the file (like there was a cursor)
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("test10.txt", "rw")) { // second parameter 'read/write'

            int a = randomAccessFile.read(); // read 1 character and move cursor 1 position forward
            System.out.println((char) a);

            String s1 = randomAccessFile.readLine();
            System.out.println(s1);

            randomAccessFile.seek(101); // move the cursor to 101 positions forward
            String s2 = randomAccessFile.readLine();
            System.out.println(s2);

            long filePointer = randomAccessFile.getFilePointer();
            System.out.println(filePointer);

            randomAccessFile.seek(0);
            randomAccessFile.writeBytes("Hello");
            randomAccessFile.seek(randomAccessFile.length() - 1);
            randomAccessFile.writeBytes("\n\n\t\t\t\t\t  William Butler Yeats");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
