

public class Clothing extends Product {

    private String size;
    private String fabricType;

    public Clothing(String id, String name, double price, int stock,
                    String size, String fabricType) {
        super(id, name, price, stock);
        this.size = size;
        this.fabricType = fabricType;
    }

    @Override
    public double calculatePrice() {
        return basePrice - (basePrice * 0.10); // 10% discount
    }
}
