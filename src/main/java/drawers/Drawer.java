package drawers;

import products.Product;

import java.util.ArrayList;

public class Drawer {
    private double price;
    private ArrayList<Product> products;
    private DrawerCode code;


    public Drawer(DrawerCode code) {

        this.price = 0.0;
        this.code = code;
        this.products = new ArrayList<>();
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public DrawerCode getCode() {
        return code;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
