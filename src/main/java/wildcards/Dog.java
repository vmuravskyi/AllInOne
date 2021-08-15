package wildcards;

public class Dog extends Animal{

    private int numberOfLegs;

    public Dog(int id, int numberOfLegs) {
        super(id);
        this.numberOfLegs = numberOfLegs;
    }
}