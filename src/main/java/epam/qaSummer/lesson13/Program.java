package epam.qaSummer.lesson13;

import java.io.IOException;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) throws IOException {

        int[] mas = {2, 3, 4, 5, 6, 77, 8, 3, 4};
//        writeMasToCsv(mas, "out.csv");
        String[] words = UtilFile.getMasStringFromFile("out.csv");
        int[] values = UtilFile.getIntValues(words);
        System.out.println(Arrays.toString(values));

    }

}
