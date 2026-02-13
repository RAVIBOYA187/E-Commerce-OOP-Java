

public class Admin extends User {

    public Admin(String userId, String name, String email) {
        super(userId, name, email);
    }

    public void addProduct(Product product) {
        System.out.println("Product added: " + product.getName());
    }

    public void removeProduct(Product product) {
        System.out.println("Product removed: " + product.getName());
    }

    public void updateStock(Product product, int stock) {
        product.setStock(stock);
        System.out.println("Stock updated for " + product.getName());
    }
}
