package Ex05_06;

public interface CardPayable extends PaymentMethod {
    void processCardPayment(double amount);
}
