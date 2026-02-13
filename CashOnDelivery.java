


public class CashOnDelivery implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Cash will be collected on delivery: " + amount);
    }

    @Override
    public void generateReceipt() {
        System.out.println("COD Receipt Generated.");
    }
}
