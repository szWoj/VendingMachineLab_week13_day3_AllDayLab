package products;

import products.Product;

public class Drink extends Product {

    private double price;

    public Drink(String name, String brand) {
        super(name, brand);
        this.price = 1.00;
    }

    public double getPrice() {
        return price;
    }
}
