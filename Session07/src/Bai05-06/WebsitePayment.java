package Ex05_06;

public class WebsitePayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Xử lý thanh toán thẻ tín dụng qua cổng thanh toán online");
    }
}
