package java_black_belt.section09_IO_NIO_Streams.lesson102_Channel_Buffer_important_methods;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx2 {

    public static void main(String[] args) {

        try (RandomAccessFile randomAccessFile = new RandomAccessFile("ChannelBufferEx2.txt", "r");
            FileChannel channel = randomAccessFile.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());

            buffer.rewind();
            System.out.println((char) buffer.get()); //a

            System.out.println("--------------------------------------------");
            buffer.compact();
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }

            System.out.println("--------------------------------------------");
            buffer.clear();
            channel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get());
            buffer.mark();
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            buffer.reset();
            System.out.println((char) buffer.get());
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
