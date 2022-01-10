package functional_reactive_programming_java.section09.decorator;

public class DecoratorPattern {

    public static void main(String[] args) {

        Burger myBurger = new BurgerShop(Burger::addCheese)
                .use(
                        new BurgerShop(Burger::addVeggies)
                                .use(new Burger())
                );

        System.out.println("I get" + myBurger);

    }
}
