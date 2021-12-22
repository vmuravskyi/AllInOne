package designpatterns.design_patterns__and_solid_principles.creational.factory.factorymethod;

import designpatterns.design_patterns__and_solid_principles.creational.factory.factorymethod.message.JSONMessage;
import designpatterns.design_patterns__and_solid_principles.creational.factory.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
