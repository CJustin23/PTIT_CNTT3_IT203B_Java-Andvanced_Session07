package Ex05_06;

public class PushNotification implements NotificationService{
    public void send(String message, String recipient) {}

    @Override
    public void notifyCustomer(String message) {
        System.out.println("Gửi push notification: Đơn hàng thành công");
    }
}
