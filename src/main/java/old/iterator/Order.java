package old.iterator;

import java.util.Objects;

public class Order {
    private long orderId;
    private double amount;

    public Order(long orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && Double.compare(order.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, amount);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
