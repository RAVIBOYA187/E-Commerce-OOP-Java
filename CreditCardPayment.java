

public class CreditCardPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of " + amount);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Credit Card Receipt Generated.");
    }
}
