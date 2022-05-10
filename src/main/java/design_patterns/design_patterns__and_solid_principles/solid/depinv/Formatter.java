package design_patterns.design_patterns__and_solid_principles.solid.depinv;

//Common interface for classes formatting Message object
public interface Formatter {
	
	public String format(Message message) throws FormatException;
	
}
