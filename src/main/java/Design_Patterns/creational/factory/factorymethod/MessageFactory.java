package Design_Patterns.creational.factory.factorymethod;

import Design_Patterns.creational.factory.factorymethod.message.MessageTypes;

public class MessageFactory {
    public static MessageCreator getMessageCreator(MessageTypes type) {
        switch (type) {
            case JSON:
                return new JSONMessageCreator();
            case TEXT:
                return new TextMessageCreator();
            default:
                throw new IllegalArgumentException();
        }
    }
}
