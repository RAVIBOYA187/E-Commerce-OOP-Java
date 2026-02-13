
import java.util.ArrayList;
import java.util.List;



public class Customer extends User {

    private Cart cart;
    private List<Order> orders = new ArrayList<>();

    public Customer(String userId, String name, String email) {
        super(userId, name, email);
        this.cart = new Cart();
    }

    public Cart getCart() {
        return cart;
    }

    public void placeOrder(Payment payment, DeliveryService delivery) {
        Order order = new Order(cart.getProducts(), payment, delivery);
        order.createOrder();
        orders.add(order);
        cart.clearCart();
    }
}
