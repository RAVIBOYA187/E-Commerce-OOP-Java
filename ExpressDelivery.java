

public  class ExpressDelivery extends DeliveryService {

    public ExpressDelivery(String trackingId) {
        super(trackingId);
    }

    @Override
    public double calculateCharge() {
        return 150;
    }
}
