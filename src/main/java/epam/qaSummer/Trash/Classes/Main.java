package epam.qaSummer.Trash.Classes;

public class Main {
    public static void main(String[] args) {

	Person.displayCounter();

	Person vova = new Person();
	Person john = new Person();
//        Person.counter = 123;
	Person jack = new Person();

	vova.displayId();
	john.displayId();

	Person.displayCounter();

	jack.displayId();
    }
}
