package Ex05_06;

class POSFactory implements SalesChannelFactory {
    public DiscountStrategy createDiscount(){
        return new MemberDiscount();
    }
    public PaymentMethod createPayment(){
        return new POSPayment();
    }

    public NotificationService createNotification(){
        return new PrintInvoiceNotification();
    }

}