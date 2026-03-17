package Ex05_06;

public class MomoPayment implements EWalletPayable {
    @Override
    public void processmomo(double amount) {
        System.out.println("Xử lý thanh toán MoMo: " + (int) amount + " - Thành công");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Xử lý thanh toán MoMo tích hợp");
    }
}
