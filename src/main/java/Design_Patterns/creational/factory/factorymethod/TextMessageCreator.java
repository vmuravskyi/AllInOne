package Design_Patterns.creational.factory.factorymethod;

import Design_Patterns.creational.factory.factorymethod.message.Message;
import Design_Patterns.creational.factory.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
