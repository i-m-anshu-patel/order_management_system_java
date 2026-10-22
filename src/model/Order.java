package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> allItems = new ArrayList<>();
    private OrderStatus status = OrderStatus.CREATED;

    
    public void addItem(OrderItem neworderItem) {
        allItems.add(neworderItem);
    }

    public double getTotal() {
        double total = 0;
        for(OrderItem item : allItems) {
            total += item.getSubtotal();
        }
        return total;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void updateStatus(OrderStatus newStatus) {


        boolean validTransition = switch (status) {
            case CREATED ->
                newStatus == OrderStatus.CONFIRMED ||
                newStatus == OrderStatus.CANCELLED;
            case CONFIRMED ->
                newStatus == OrderStatus.SHIPPED ||
                newStatus == OrderStatus.CANCELLED;
            case SHIPPED ->
                newStatus == OrderStatus.DELIVERED;
            case DELIVERED, CANCELLED -> false;
        };

        if (!validTransition) {
            throw new IllegalStateException(
                "Cannot transition from " + status + " to " + newStatus
            );
        }

        status = newStatus;
    }
}
