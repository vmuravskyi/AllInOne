package functional_reactive_programming_java.section09.fluentInterface;

public class FluentShopping {
    public static void main(String[] args) {

        Order myOrder = new Order();

        Order.place(order ->
                order.add("Shoes")
                        .add("")
                        .deliverAt("Street number 15, house 10")
        );

    }
}
