


public class UpiPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of " + amount);
    }

    @Override
    public void generateReceipt() {
        System.out.println("UPI Receipt Generated.");
    }
}
