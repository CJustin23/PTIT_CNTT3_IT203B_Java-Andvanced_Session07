package Ex05_06;

public class EmailService implements NotificationService {
    @Override
    public void send(String message, String recipient){
        System.out.println("Gửi email: " + message);
    }

    @Override
    public void notifyCustomer(String message) {

    }
}
