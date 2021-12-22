package designpatterns.design_patterns__and_solid_principles.creational.factory.factorymethod;

import designpatterns.design_patterns__and_solid_principles.creational.factory.factorymethod.message.Message;
import designpatterns.design_patterns__and_solid_principles.creational.factory.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
