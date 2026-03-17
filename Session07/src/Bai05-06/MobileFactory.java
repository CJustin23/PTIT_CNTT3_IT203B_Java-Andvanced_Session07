package Ex05_06;

public class MobileFactory implements SalesChannelFactory {
    @Override
    public DiscountStrategy createDiscount() {
        return new MobileFirstOrderDiscount();
    }

    @Override
    public PaymentMethod createPayment() {
        return new MomoPayment();
    }

    @Override
    public NotificationService createNotification() {
        return new PushNotification();
    }
}
