package Interfaces;

public class Test {
    public static void main(String[] args) {

        Animal animal = new Animal(1);
        Person person = new Person("Vasya");
        outputInfo(animal);
        outputInfo(person);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}

