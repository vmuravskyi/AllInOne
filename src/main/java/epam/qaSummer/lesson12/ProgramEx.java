package epam.qaSummer.lesson12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class MarkIlligalArgumentException extends Exception {

    public MarkIlligalArgumentException() {
        super();
    }

    public MarkIlligalArgumentException(String message) {
        super(message);
    }
}

public class ProgramEx {
    static Logger log = Logger.getLogger(ProgramEx.class.getSimpleName());

    static {
        try {
            log.setLevel(Level.SEVERE);
            FileHandler fileHandler = new FileHandler(ProgramEx.class.getSimpleName() + "log");
            fileHandler.setFormatter(new SimpleFormatter());
            log.addHandler(fileHandler);
        } catch (IOException e) {
            log.severe("Cant create new file " + Arrays.toString(e.getStackTrace()));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = getMark(sc);
            log.info("mas[i] = " + mas[i]);
        }
        log.info("main exit");
        sc.close();
    }

    private static int getMark(Scanner sc) {
        while (true)
            try {
                System.out.println("Enter int mark");
                int value = getIntValueFromConsole(sc);
                if (value <= 0 || value > 12)
                    throw new MarkIlligalArgumentException("Not a mark");
                return value;
            } catch (MarkIlligalArgumentException e) {
                log.severe("Not a mark, try again" + Arrays.toString(e.getStackTrace()));
            }
    }

    private static int getIntValueFromConsole(Scanner sc) {
        while (true) {
            try {
                String valueStr = sc.next();
                log.info("value = " + valueStr);
                int value = Integer.parseInt(valueStr);
                return value;
            } catch (NumberFormatException exception) {
                log.severe("Not int, try again");
                sc.nextLine();
            }
        }
    }
}
