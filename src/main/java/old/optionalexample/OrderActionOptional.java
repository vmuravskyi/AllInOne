package old.optionalexample;

import java.util.List;
import java.util.Optional;

public class OrderActionOptional {
    public Optional<Order> findById(List<Order> orders, int id) {
        return orders.stream().filter(order -> id == order.getId()).findAny();
    }
}
