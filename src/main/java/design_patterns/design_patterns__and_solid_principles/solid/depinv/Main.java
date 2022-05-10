package design_patterns.design_patterns__and_solid_principles.solid.depinv;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        Message msg = new Message("This is a new refactored message");
        MessagePrinter printer = new MessagePrinter();
        try (PrintWriter writer = new PrintWriter(new FileWriter("test_msg.txt"))) {
            printer.writeMessage(msg, "test_msg.txt", new JSONFormatter(), writer);
        }
    }

}
