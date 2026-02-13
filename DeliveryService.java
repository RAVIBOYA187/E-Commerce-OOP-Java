
 public abstract class DeliveryService {

    protected String trackingId;

    public DeliveryService(String trackingId) {
        this.trackingId = trackingId;
    }

    public abstract double calculateCharge();

    public void deliver() {
        System.out.println("Delivery started. Tracking ID: " + trackingId);
    }
}






