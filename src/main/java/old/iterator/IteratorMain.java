package old.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<Order>();
        orderList.add(new Order(4, 123));
        orderList.add(new Order(3, 22));
        orderList.add(new Order(33, 21));
        orderList.add(new Order(456, 24));
        orderList.add(new Order(88, 255));
        orderList.add(new Order(76, 2));
        orderList.add(new Order(23, 4));
        orderList.add(new Order(6, 56));
        System.out.println(orderList);

        float bigAmount = 10;
        int percent = 5;
        OrderAction action = new OrderAction();
        action.discountAction(25, orderList, 15);
        System.out.println(orderList);

        float anotherBigAmount = 100;
        orderList.removeIf(order -> order.getAmount() <= anotherBigAmount);
        orderList.forEach(o -> o.setAmount(o.getAmount() * (100 - percent)/100.0));
        System.out.println(orderList);
    }
}
