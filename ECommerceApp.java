public class ECommerceApp {

    public static void main(String[] args) {

        Customer customer = new Customer("C1", "Ravi", "ravi@mail.com");

        Product laptop = new Electronics("P1", "Laptop", 50000, 10, 24, "Dell");
        Product shirt = new Clothing("P2", "Shirt", 2000, 20, "L", "Cotton");

        customer.login();

        customer.getCart().addProduct(laptop);
        customer.getCart().addProduct(shirt);

        Payment payment = new CreditCardPayment();
        DeliveryService delivery = new ExpressDelivery("TRK123");

        customer.placeOrder(payment, delivery);

        customer.logout();
    }
}
