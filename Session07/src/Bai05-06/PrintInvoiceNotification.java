package Ex05_06;

class PrintInvoiceNotification implements NotificationService {
    @Override
    public void send(String message, String recipient) {

    }

    @Override
    public void notifyCustomer(String message){
        System.out.println("In hóa đơn giấy");
    }
}
