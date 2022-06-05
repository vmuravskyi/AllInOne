package java_object_oriented_programming.section03_object_oriented_programming_concepts.lesson17_association_has_a;

class House {
    private final Kitchen kitchen;

    public House() {
        this.kitchen = new Kitchen();
        kitchen.setFood("Salad");
    }

    public String getFood() {
        return kitchen.getFood();
    }
}

class Kitchen {
    private String food;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}

public class CompositionDemo {

    public static void main(String[] args) {

        House house = new House();

        System.out.println(house.getFood());

    }

}
