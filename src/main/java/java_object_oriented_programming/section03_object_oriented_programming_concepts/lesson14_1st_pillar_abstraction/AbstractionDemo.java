package java_object_oriented_programming.section03_object_oriented_programming_concepts.lesson14_1st_pillar_abstraction;

import java.util.ArrayList;
import java.util.List;

interface Mobile {

    void calling(String number);

    void sendMessage(String number);

}

class Apple implements Mobile {

    private final List<String> contacts = new ArrayList<>();

    public void addContact(String number) {
        contacts.add(number);
    }

    @Override
    public void calling(String number) {
        System.out.println("Calling..... " + number);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message....." + message);
    }

}

public class AbstractionDemo {

    public static void main(String[] args) {

        Apple applePhone = new Apple();
        applePhone.calling("13123123123123");
        applePhone.sendMessage("This is a message");
        applePhone.addContact("+38 097 123 123 12");


        Samsung samsungPhone = new Samsung();
        samsungPhone.calling("12312312");
        samsungPhone.sendMessage("This is a message for samsung");
        samsungPhone.addContact("+38 097 123 456 78");

    }

}

abstract class Mobilee {

    private final List<String> contacts = new ArrayList<>();

    abstract void calling(String number);

    abstract void sendMessage(String message);

    public void addContact(String number) {
        contacts.add(number);
    }

}

class Samsung extends Mobilee {

    @Override
    void calling(String number) {
        System.out.println("Calling....." + number);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("Sending message....." + message);
    }

}
