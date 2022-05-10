package design_patterns.design_patterns__and_solid_principles.solid.depinv;

import java.io.IOException;

//Thrown by formatter
public class FormatException extends IOException {
	
	public FormatException(Exception cause) {
		super(cause);
	}
}
