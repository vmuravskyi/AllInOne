package epam.qaSummer.lesson14;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;



public class ProgramSer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Droid d1 = new Droid("R2D2", 10, 90);
        d1.addWeapon("Rocket");
        Droid.armyName = "A";
//        serializeBin(d1, "droid.dat");
        Droid.armyName = "B";
//        Droid d2 = deserializeBin("droid.dat");
//        System.out.println(d2);

        try(XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("droid.xml")))) {
            xmlEncoder.writeObject(d1);
            xmlEncoder.flush();
        }

        try(XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("droid.xml")))) {
            Droid d12 = (Droid) xmlDecoder.readObject();
            System.out.println(d12);
        }
    }

    private static Droid deserializeBin(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Droid d2 = (Droid) ois.readObject();
            return d2;
        }
    }

    private static void serializeBin(Droid d1, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(d1);
        }
    }

    private static void writeDroidsToFile() throws IOException {
        Droid[] droids = {
                new Droid("R2D1", 15, 80),
                new Droid("R2D2", 14, 85),
                new Droid("R2D3", 17, 95)
        };
        // writeToCsv(d1, "d1.csv");
        // writeAllToCsv(droids, "droids.csv");

        try (FileWriter fw = new FileWriter("droidsHelp.csv")) {
            fw.write(DroidHelper.convertToCSV(droids));
        }
    }
}
