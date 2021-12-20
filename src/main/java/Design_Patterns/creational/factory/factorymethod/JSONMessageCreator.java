package Design_Patterns.creational.factory.factorymethod;

import Design_Patterns.creational.factory.factorymethod.message.JSONMessage;
import Design_Patterns.creational.factory.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
