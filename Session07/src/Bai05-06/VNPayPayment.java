package Ex05_06;

class VNPayPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Thanh toán VNPay: "+amount);
    }
}