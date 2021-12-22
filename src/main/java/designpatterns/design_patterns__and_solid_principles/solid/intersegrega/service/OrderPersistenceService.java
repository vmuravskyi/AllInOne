package designpatterns.design_patterns__and_solid_principles.solid.intersegrega.service;

import designpatterns.design_patterns__and_solid_principles.solid.intersegrega.entity.Order;

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
