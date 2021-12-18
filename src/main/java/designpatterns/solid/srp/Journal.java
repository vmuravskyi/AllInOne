package designpatterns.solid.srp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

class Journal {
    private static int count = 0;
    private final List<String> entries = new ArrayList<>();

    public void addEntry(String text) {
        entries.add("" + (count++) + ": " + text);

    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    // such functionality should be moved to another class which is created for saving objects
    public void save(String filename) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(filename)) {
            out.println(this);
        }
    }

    public void load(String filname) {
    }

    public void load(URL url) {
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

}

class Persistence {

    public void saveToFile(Journal journal,
                           String filename,
                           boolean overwrite) {
        if (overwrite || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public Journal load(String filename) {
        return null;
    }

    public Journal load(URL url) {
        return null;
    }

}

class Demo {
    public static void main(String[] args) throws Exception {
        Journal j = new Journal();
        j.addEntry("I smile today");
        j.addEntry("I ate a bug");
        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "src/main/java/Design_Patterns/srp/journal.txt";
        p.saveToFile(j, filename, true);

        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}
