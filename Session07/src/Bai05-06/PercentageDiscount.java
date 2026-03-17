package Ex05_06;

public class PercentageDiscount implements DiscountStrategy {
    private double percent;

    public PercentageDiscount() {
    }

    public PercentageDiscount(double percent) {
        this.percent = percent;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * (1 - percent / 100);
    }
}
