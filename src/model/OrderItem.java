package model;

public class OrderItem {
    private final Product product;
    private final double unitPrice;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }

        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }

        this.product = product;
        this.unitPrice = product.getPrice();
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubtotal() {
        return unitPrice * quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }
        this.quantity = quantity;
    }
}
