import java.util.*;


 public class Order {

    private List<Product> products;
    private Payment payment;
    private DeliveryService delivery;

    public Order(List<Product> products,
                 Payment payment,
                 DeliveryService delivery) {
        this.products = products;
        this.payment = payment;
        this.delivery = delivery;
    }

    public void createOrder() {
        double total = 0;
        for (Product p : products) {
            total += p.calculatePrice();
        }

        total += delivery.calculateCharge();

        payment.processPayment(total);
        payment.generateReceipt();
        delivery.deliver();

        System.out.println("Order placed successfully. Total: " + total);
    }
}
