package products;

import products.Product;

public class Sweet extends Product {

    private double price;

    public Sweet(String name, String brand) {
        super(name, brand);
        this.price = 0.65;
    }

    public double getPrice() {
        return price;
    }
}
