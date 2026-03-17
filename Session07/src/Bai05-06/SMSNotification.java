package Ex05_06;

public class SMSNotification implements NotificationService {
    @Override
    public void send(String message, String recipient){
        System.out.println("Gửi SMS: " + message);
    }

    @Override
    public void notifyCustomer(String message) {

    }
}
