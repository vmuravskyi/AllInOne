package optionalexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestOrder {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>();

        list.add(new Order(1));
        list.add(new Order(2));
        list.add(new Order(3));
        list.add(new Order(4));
        list.add(new Order(5));


        OrderActionOptional optional = new OrderActionOptional();

        Optional<Order> res1 = optional.findById(list, 5);
        Optional<Order> res2 = optional.findById(list, 123);
        System.out.println(res1.orElse(new Order(5)));
        System.out.println(res2.orElse(new Order(123)));
    }
}
