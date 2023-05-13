public class Furniture {
    private String name;
    private double price;
    private final double vat = 0.23;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getPricePlusVat() {
        return price+(price*vat);
    }
}
