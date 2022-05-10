package design_patterns.design_patterns__and_solid_principles.creational.factory.factorymethod.message;

public class JSONMessage extends Message {

	@Override
	public String getContent() {
		return "{\"JSON]\":[]}";
	}
	
}
