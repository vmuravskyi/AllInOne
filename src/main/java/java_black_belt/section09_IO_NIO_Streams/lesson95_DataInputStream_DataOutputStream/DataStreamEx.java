package java_black_belt.section09_IO_NIO_Streams.lesson95_DataInputStream_DataOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamEx {

    public static void main(String[] args) {

        // DataInputStream and DataOutputStream is used to read and write primitive data types
        try (DataOutputStream outputStream = new DataOutputStream(
            new FileOutputStream("my_test.bin"));
            DataInputStream inputStream = new DataInputStream(
                new FileInputStream("my_test.bin"))) {

            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeChar('A');
            outputStream.writeShort(120);
            outputStream.writeInt(500);
            outputStream.writeLong(1_000_000_000L);
            outputStream.writeFloat(3.14F);
            outputStream.writeDouble(123.456);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readChar());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
