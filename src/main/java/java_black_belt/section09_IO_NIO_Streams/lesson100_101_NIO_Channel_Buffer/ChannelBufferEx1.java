package java_black_belt.section09_IO_NIO_Streams.lesson100_101_NIO_Channel_Buffer;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {

    public static void main(String[] args) {

        try (RandomAccessFile accessFile = new RandomAccessFile("src/main/resources/data/rubai.txt", "rw");
            FileChannel channel = accessFile.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder sb = new StringBuilder();
            var read = channel.read(buffer);
            while (read > 0) {
                System.out.println("Byte read: " + read);
                buffer.flip();
                while (buffer.hasRemaining()) {
                    sb.append((char) buffer.get());
                }
                buffer.clear();
                read = channel.read(buffer);
            }
            System.out.println(sb);

            String text = "\nThere are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle.";

//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//            buffer2.put(text.getBytes());
//            buffer2.flip();
//            channel.write(buffer2);

            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
