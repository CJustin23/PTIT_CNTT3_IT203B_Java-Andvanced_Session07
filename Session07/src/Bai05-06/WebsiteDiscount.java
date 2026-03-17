package Ex05_06;

public class WebsiteDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double totalAmount) {
        System.out.println("Áp dụng giảm giá 10% cho đơn hàng website");
        return totalAmount * 0.9;
    }
}
