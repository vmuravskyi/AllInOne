package design_patterns.design_patterns__and_solid_principles.solid.depinv;

import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	//Writes message to a file
	public void writeMessage(Message msg, String fileName, Formatter formatter, PrintWriter writer) throws IOException {
			writer.println(formatter.format(msg)); //formats and writes message
			writer.flush();
	}
}
