package design_patterns.design_patterns__and_solid_principles.creational.factory.factorymethod;

import design_patterns.design_patterns__and_solid_principles.creational.factory.factorymethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

	public Message getMessage() {
        Message msg = createMessage();

        msg.addDefaultHeaders();
        msg.encrypt();

        return msg;
    }

    // Factory method
    public abstract Message createMessage();
}
