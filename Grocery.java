

public class Grocery extends Product {

    private String expiryDate;

    public Grocery(String id, String name, double price, int stock,
                   String expiryDate) {
        super(id, name, price, stock);
        this.expiryDate = expiryDate;
    }

    @Override
    public double calculatePrice() {
        return basePrice; // No discount
    }
}