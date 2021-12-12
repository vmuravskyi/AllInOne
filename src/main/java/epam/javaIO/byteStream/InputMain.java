package epam.javaIO.byteStream;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputMain {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();


        try (FileInputStream input = new FileInputStream("src/main/java/epam/javaIO/data/info.txt")) {
            int code = input.read();
            logger.info(code);
            logger.info(code + " code = " + (char) code);
            byte[] arrByte = new byte[16];
            int num = input.read(arrByte);
            logger.info(num);
            logger.info(Arrays.toString(arrByte));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
