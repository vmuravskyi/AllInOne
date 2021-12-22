package designpatterns.design_patterns__and_solid_principles.creational.factory.factorymethod;

import designpatterns.design_patterns__and_solid_principles.creational.factory.factorymethod.message.MessageTypes;

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
