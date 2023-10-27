package epam.javaIO.printWriter;

import java.io.*;

public class PrintMain {

    public static void main(String[] args) {

        File file = new File("src/main/java/epam/javaIO/data/res.txt");
        double[] values = {1.10, 1.2, 1.401, 5.01, 6.017, 7, 8};
        try (PrintStream stream = new PrintStream(new FileOutputStream(file))) {
            for (double value : values) {
                stream.printf("Java %.2g%n", value);
                System.setOut(stream);
                System.out.printf("%.2g%n", value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file)))) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
