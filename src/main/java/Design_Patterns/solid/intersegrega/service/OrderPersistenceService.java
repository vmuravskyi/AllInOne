package Design_Patterns.solid.intersegrega.service;

import Design_Patterns.solid.intersegrega.entity.Order;
import Design_Patterns.solid.intersegrega.service.PersistenceService;

import java.util.HashMap;
import java.util.Map;

public class OrderPersistenceService implements PersistenceService<Order> {

    private static final Map<Long, Order> ORDERS = new HashMap<>();

    @Override
    public void save(Order entity) {
        synchronized (ORDERS) {
            ORDERS.put(entity.getId(), entity);
        }
    }

    @Override
    public void delete(Order entity) {
        ORDERS.remove(entity.getId());
    }

    @Override
    public Order findById(Long id) {
        return ORDERS.get(id);
    }

}
