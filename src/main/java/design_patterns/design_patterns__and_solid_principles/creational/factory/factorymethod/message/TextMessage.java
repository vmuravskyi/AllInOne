package design_patterns.design_patterns__and_solid_principles.creational.factory.factorymethod.message;

public class TextMessage extends Message {
	
	@Override
	public String getContent() {
		return "Text";
	}
	
}
