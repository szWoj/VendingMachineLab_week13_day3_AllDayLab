package drawers;

import products.Product;
import products.Sweet;

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

    public boolean productsTypeMatch(Product product){
        if(products.size() == 0 || product.getPrice() == price){
            return true;
        } else {
            return false;
        }
    }

    public void addProduct(Product product) {
        if( productsTypeMatch(product) && products.size() < 5){
        products.add(product);
        this.price = product.getPrice();}
    }

    public Product removeProduct(){
        if(products.size() > 0){

            Product vendedProduct = products.remove(0);
            if(products.size()==0){
                this.price = 0;

            }
            return vendedProduct;
        }
        return null;
    }
}
