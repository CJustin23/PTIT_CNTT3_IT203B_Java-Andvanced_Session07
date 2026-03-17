package Ex05_06;

public class MobileFirstOrderDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.9;
    }
}
