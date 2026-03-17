package Bai01;
import java.util.ArrayList;
import java.util.List;
class Product {
    String id, name;
    double price;
    Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
class Customer {
    String name, email, address;
    Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }
}
class Order {
    String id;
    Customer customer;
    List<Product> products = new ArrayList<>();
    double total;
    Order(String id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }
    void addProduct(Product p) {
        products.add(p);
    }
}
class OrderCalculator {
    double calculateTotal(Order order) {
        return order.products.stream().mapToDouble(p -> p.price).sum();
    }
}
class OrderRepository {
    void save(Order order) {
        System.out.println("Đã lưu đơn hàng " + order.id);
    }
}
class EmailService {
    void sendConfirmation(Customer customer, String orderId) {
        System.out.println("Đã gửi email đến " + customer.email + ": Đơn hàng " + orderId + " đã được tạo");
    }
}
public class Main {
    public static void main(String[] args) {
        // Tạo sản phẩm
        Product p1 = new Product("SP01", "Laptop", 15000000);
        Product p2 = new Product("SP02", "Chuột", 300000);
        System.out.println("Đã thêm sản phẩm SP01, SP02");
        // Tạo khách hàng
        Customer customer = new Customer("Nguyễn Văn A", "a@example.com", "Hà Nội");
        System.out.println("Đã thêm khách hàng");
        // Tạo đơn hàng
        Order order = new Order("ORD001", customer);
        order.addProduct(p1);
        order.addProduct(p2);
        System.out.println("Đơn hàng ORD001 được tạo");
        // Tính tổng tiền — in nguyên bản, không định dạng
        OrderCalculator calc = new OrderCalculator();
        order.total = calc.calculateTotal(order);
        System.out.println("Tổng tiền: " + order.total);
        // Lưu đơn hàng
        OrderRepository repo = new OrderRepository();
        repo.save(order);
        // Gửi email xác nhận
        EmailService email = new EmailService();
        email.sendConfirmation(customer, order.id);
    }
}