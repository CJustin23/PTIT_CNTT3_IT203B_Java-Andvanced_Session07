package Bai03;
interface CODPayable {
    void processCOD(double amount);
}
interface CardPayable {
    void processCreditCard(double amount);
}
interface EWalletPayable {
    void processMomo(double amount);
}
interface PaymentMethod {
    void process(double amount);
}
class CODPayment implements CODPayable, PaymentMethod {
    @Override
    public void processCOD(double amount) {
        System.out.println("Xử lý thanh toán COD: " + amount + " - Thành công");
    }
    @Override
    public void process(double amount) {
        processCOD(amount);
    }
}
class CreditCardPayment implements CardPayable, PaymentMethod {
    @Override
    public void processCreditCard(double amount) {
        System.out.println("Xử lý thanh toán thẻ tín dụng: " + amount + " - Thành công");
    }
    @Override
    public void process(double amount) {
        processCreditCard(amount);
    }
}
class MomoPayment implements EWalletPayable, PaymentMethod {
    @Override
    public void processMomo(double amount) {
        System.out.println("Xử lý thanh toán MoMo: " + amount + " - Thành công");
    }
    @Override
    public void process(double amount) {
        processMomo(amount);
    }
}
class PaymentProcessor {
    public void processPayment(PaymentMethod method, double amount) {
        method.process(amount);
    }
}
public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        CODPayment cod = new CODPayment();
        processor.processPayment(cod, 500000.0);
        CreditCardPayment card = new CreditCardPayment();
        processor.processPayment(card, 1000000.0);
        MomoPayment momo = new MomoPayment();
        processor.processPayment(momo, 750000.0);
        PaymentMethod payment = new MomoPayment();
        processor.processPayment(payment, 500000.0);
    }
}