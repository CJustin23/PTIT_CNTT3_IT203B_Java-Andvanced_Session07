package Ex05_06;

class OrderService {
    private SalesChannelFactory factory;
    public OrderService(SalesChannelFactory factory){
        this.factory = factory;
    }

    public void createOrder(double total){
        DiscountStrategy discount = factory.createDiscount();
        PaymentMethod payment = factory.createPayment();
        NotificationService notification = factory.createNotification();

        double finalAmount = discount.applyDiscount(total);

        payment.pay(finalAmount);
        notification.notifyCustomer("Đơn hàng thành công");
    }
}