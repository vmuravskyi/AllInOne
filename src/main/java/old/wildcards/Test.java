package old.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<Animal>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog(3, 4));
        listOfDogs.add(new Dog(3, 3));

        test(listOfAnimals);
        test(listOfDogs);

        Animal cat = new Animal(){
            @Override
            public void eat() {
                System.out.println("Cat is eating");
            }
        };

        cat.eat();
    }

    private static void test(List<? extends Animal> listAnimal) {
        for (Animal animal : listAnimal) {
            System.out.println("\t"+animal);
            animal.eat();
        }
    }
}
