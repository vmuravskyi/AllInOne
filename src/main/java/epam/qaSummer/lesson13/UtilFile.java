package epam.qaSummer.lesson13;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class UtilFile {
    public static int[] getIntValues(String[] words) {
        int[] values = new int[words.length];
        for (int i = 0; i < values.length; i++) {
            double temp = Double.parseDouble(words[i].replace(",", "."));
            values[i] = (int) Math.round(temp);
        }
        return values;
    }


    public static String[] getMasStringFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName, Charset.forName("WINDOWS-1251")));
        String str = br.readLine();
        String[] words = str.split(";");
        return words;
    }

    public static void writeMasToCsv(int[] mas, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
//        fw.write(Arrays.toString(mas));
        for (var element : mas) {
            fw.write(element + ";");
        }
        fw.close();
    }

    public static void writeMasToFile(int[] mas, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
//        fw.write(Arrays.toString(mas));
        for (var element : mas) {
            fw.write(element + " ");
        }
        fw.close();
    }
}
