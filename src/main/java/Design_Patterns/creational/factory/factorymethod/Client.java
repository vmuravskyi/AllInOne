package Design_Patterns.creational.factory.factorymethod;

import Design_Patterns.creational.factory.factorymethod.message.Message;
import Design_Patterns.creational.factory.factorymethod.message.MessageTypes;

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
