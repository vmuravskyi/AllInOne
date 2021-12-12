package epam.qaSummer.lesson14;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class DroidHelper {
    public static String convertToCSV(Droid droid) {
        StringBuilder sb = new StringBuilder();
        sb.append(droid.getName() + ";");
        sb.append(droid.getMove() + ";");
        sb.append(droid.getHealth());
        return sb.toString();
    }

    public static String convertToCSV(Droid[] droids) {
        StringBuilder sb = new StringBuilder();
        for (var droid : droids) {
            sb.append(convertToCSV(droid) + "\n");
        }
        return sb.toString();
    }

    public static void writeAllToCsv(Droid[] droids, String fileName) throws IOException {
        try (FileWriter fw = new FileWriter(fileName)) {
            for (var droid : droids) {
                fw.write(droid.toCsvString() + "\n");
            }
        }
    }

    public static void writeToCsv(Droid[] droids, String fileName) throws IOException {
        for (var droid : droids) {
            writeToCsv(droid, fileName + droid.getName() + ".csv");
        }
    }

    public static void writeToCsv(Droid d, String fileName) throws IOException {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(d.toCsvString());
        }
    }

    public static void writeDroidStrToCsvFile(Droid d1) throws IOException {
        FileWriter fw = new FileWriter("droidStr.csv");
        StringBuilder sb = new StringBuilder();
        sb.append(d1.getName() + ";");
        sb.append(d1.getMove() + ";");
        sb.append(d1.getHealth() + ";");
        fw.write(sb.toString());
        fw.close();
    }

    public static void writeDroidStrToTxtFile(Droid d1) throws IOException {
        FileWriter fw = new FileWriter("droidStr.txt");
        fw.write(d1.getName() + " ");
        fw.write(d1.getMove() + " ");
        fw.write(d1.getHealth() + " ");
        fw.close();
    }

    public static void writeDroidToTxtFile(Droid d1) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("droidBin.txt"));
        dos.writeUTF(d1.getName());
        dos.writeUTF(Integer.toString(d1.getMove()));
        dos.writeUTF(Double.toString(d1.getHealth()));
        dos.close();
    }

    public static void writeDroidToBinFile(Droid d1) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("droid.dat"));
        dos.writeUTF(d1.getName());
        dos.writeInt(d1.getMove());
        dos.writeDouble(d1.getHealth());
        dos.close();
    }
}
