package design_patterns.design_patterns__and_solid_principles.creational.factory.factorymethod;

import design_patterns.design_patterns__and_solid_principles.creational.factory.factorymethod.message.Message;
import design_patterns.design_patterns__and_solid_principles.creational.factory.factorymethod.message.MessageTypes;

public class Client {

	public static void main(String[] args) {
		printMessage(MessageFactory.getMessageCreator(MessageTypes.JSON));
		printMessage(MessageFactory.getMessageCreator(MessageTypes.TEXT));
	}
	
	public static void printMessage(MessageCreator creator) {
		Message msg = creator.getMessage();
		System.out.println(msg);
	}
}
