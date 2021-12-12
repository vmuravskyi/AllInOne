package Trash.Classes;

public class Lesson25 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.eat("meat");
        dog.showName();
    }
}
