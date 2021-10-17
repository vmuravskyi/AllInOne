package optionalExample;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OrderActionOptional {
    public Optional<Order> findById(List<Order> orders, int id) {
        return orders.stream().filter(order -> id == order.getId()).findAny();
    }
}
