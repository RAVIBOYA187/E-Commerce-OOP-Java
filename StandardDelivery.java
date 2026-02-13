

public class StandardDelivery extends DeliveryService {

    public StandardDelivery(String trackingId) {
        super(trackingId);
    }

    @Override
    public double calculateCharge() {
        return 50;
    }
}
