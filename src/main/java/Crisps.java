public class Crisps extends Product{

    private double price;

    public Crisps(String name, String brand) {
        super(name, brand);
        this.price = 0.50;
    }

    public double getPrice() {
        return price;
    }
}
