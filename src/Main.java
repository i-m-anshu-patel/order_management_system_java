import model.Product;
import model.OrderItem;
import model.Order;
public class Main {
    public static void main(String[] args) throws Exception {
        Product keyboard = new Product(101, "Kayboard", 2499.00);
        Product mouse = new Product(102, "Mouse", 999.00);
        
        Order order = new Order();
        order.addItem(new OrderItem(keyboard, 2));
        order.addItem(new OrderItem(mouse, 1));

        System.out.println("Order total: " + order.getTotal());
    }
}
