package Ex05_06;

public class MemberDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double totalAmount) {
        System.out.println("Giảm giá cho thành viên tại cửa hàng");
        return totalAmount * 0.95;    }
}
