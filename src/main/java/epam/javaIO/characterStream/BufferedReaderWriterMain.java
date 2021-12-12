package epam.javaIO.characterStream;

import java.io.*;

public class BufferedReaderWriterMain {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src/main/java/epam/javaIO/data/info.txt");
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter writer = new FileWriter("src/main/java/epam/javaIO/data/out3.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            // read line from info.txt and write the line to another file
//            String line = bufferedReader.readLine();
//            bufferedWriter.write(line);

            // read the whole file and write the content to anothe file
//            String lineOfFile = null;
//            while ((lineOfFile = bufferedReader.readLine()) != null) {
//                bufferedWriter.write(lineOfFile, 0, lineOfFile.length());
//                bufferedWriter.newLine();
//            }


            bufferedReader.lines()
                    .forEach(s -> {
                        try {
                            bufferedWriter.write(s);
                            bufferedWriter.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
