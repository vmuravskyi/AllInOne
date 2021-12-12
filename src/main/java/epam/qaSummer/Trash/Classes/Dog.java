package Trash.Classes;

public class Dog extends Animal {

    public void bark() {
        System.out.println("I am barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void eat(String food) {
        System.out.println("Dog is eating " + food);
    }

    public void showName() {
        System.out.println(name);
    }
}
