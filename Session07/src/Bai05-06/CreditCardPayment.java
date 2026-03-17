package Ex05_06;

public class CreditCardPayment implements CardPayable {
    @Override
    public void processCardPayment(double amount) {
        System.out.println("Xử lý thanh toán thẻ tín dụng: " + (int) amount + " - Thành công");
    }

    @Override
    public void pay(double amount) {

    }
}
