import model.Product;
public class Main {
    public static void main(String[] args) throws Exception {
        Product keyboard = new Product(101, "Kayboard", 2499.00);
        System.out.println(keyboard.getId());
        System.out.println(keyboard.getName());
        System.out.println(keyboard.getPrice());

        keyboard.setPrice(2199.00);

        System.out.println("Updated price: " + keyboard.getPrice());
    }
}
