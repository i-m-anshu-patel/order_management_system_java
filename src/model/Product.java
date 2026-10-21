package model;

public class Product {
    private final int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        if (id <= 0) {
            throw new IllegalArgumentException("Product Id must be positive");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }

        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }

        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Prices cannot be negative");
        }

        this.price = price;
    }
}
