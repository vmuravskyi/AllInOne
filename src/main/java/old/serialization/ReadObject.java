package old.serialization;

import java.io.*;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person[] people = (Person[]) ois.readObject();
//            int count = 0;
//            for (Person person: people) {
//                people[count] = (Person) ois.readObject();
//                count++;
//            }

            fis.close();

            System.out.println(Arrays.toString(people));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
