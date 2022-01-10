package functional_reactive_programming_java.section09.decorator;

public class Burger {

    private String burgerType;

    public Burger() {

        this.burgerType = "";
    }

    private Burger(String type) {
        this.burgerType = type;
    }

    public Burger addVeggies() {
        System.out.println("Adding veggies to the burger");
        return new Burger(this.burgerType += " Veggie");
    }

    public Burger addCheese() {
        System.out.println("Adding cheese to the burger");
        return new Burger(this.burgerType += " Cheese");
    }

    public String toString() {
        return String.format("%s", burgerType + " burger");
    }

}
