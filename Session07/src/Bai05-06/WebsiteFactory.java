package Ex05_06;

public class WebsiteFactory implements SalesChannelFactory {
    @Override
    public DiscountStrategy createDiscount() {
        return new PercentageDiscount();
    }

    @Override
    public PaymentMethod createPayment() {
        return new WebsitePayment();
    }

    @Override
    public NotificationService createNotification() {
        return new EmailNotification();
    }
}
