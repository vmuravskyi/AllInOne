package epam.qaSummer.Trash.Classes;

class Person {
    private int id = 0;
    private static int counter = 1;

    public Person() {
	id = counter++;
	System.out.println("Constructor");
    }

    public static void displayCounter() {
	System.out.printf("Counter: %d \n", counter);
    }

    public void displayId() {
	System.out.println(id);
    }
}
