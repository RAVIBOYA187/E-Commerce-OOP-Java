

public class Electronics extends Product {

    private int warrantyMonths;
    private String brand;

    public Electronics(String id, String name, double price, int stock,
                       int warrantyMonths, String brand) {
        super(id, name, price, stock);
        this.warrantyMonths = warrantyMonths;
        this.brand = brand;
    }

    @Override
    public double calculatePrice() {
        return basePrice + (basePrice * 0.18); // 18% tax
    }
}
