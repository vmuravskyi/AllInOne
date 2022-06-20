package epam.qaSummer.Trash.Classes.Interfaces;

public class Test {
    public static void main(String[] args) {
	Info info1 = new Animal(1);
	Info info2 = new Person("Vova");
	outputInfo(info1);
	outputInfo(info2);
	Animal animal = new Animal(2);
	Person person = new Person("Bob");
	outputInfo(animal);
	outputInfo(person);
    }

    public static void outputInfo(Info info) {
	info.showInfo();
    }
}
