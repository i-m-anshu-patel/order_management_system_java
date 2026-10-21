package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> allItems = new ArrayList<>();

    
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
}
