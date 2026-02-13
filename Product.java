



 public abstract class Product {

    protected String productId;
    protected String name;
    protected double basePrice;
    protected int stock;

    public Product(String productId, String name, double basePrice, int stock) {
        this.productId = productId;
        this.name = name;
        this.basePrice = basePrice;
        this.stock = stock;
    }

    public abstract double calculatePrice();

    public String getName() {
        return name;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}












