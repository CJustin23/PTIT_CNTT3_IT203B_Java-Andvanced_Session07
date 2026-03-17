package Bai04;
import java.util.ArrayList;
import java.util.List;
interface OrderRepository {
    void save(Order order);
    List<Order> findAll();
}
interface NotificationService {
    void send(String message, String recipient);
}
class Order {
    private String id;
    public Order(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Order{" + "id='" + id + '\'' + '}';
    }
}
class FileOrderRepository implements OrderRepository {
    @Override
    public void save(Order order) {
        System.out.println("Lưu đơn hàng vào file: " + order.getId());
    }
    @Override
    public List<Order> findAll() {
        return new ArrayList<>();
    }
}
class EmailService implements NotificationService {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Gửi email: " + message);
    }
}
class DatabaseOrderRepository implements OrderRepository {
    @Override
    public void save(Order order) {
        System.out.println("Lưu đơn hàng vào database: " + order.getId());
    }
    @Override
    public List<Order> findAll() {
        return new ArrayList<>();
    }
}
class SMSNotification implements NotificationService {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Gửi SMS: " + message);
    }
}
class OrderService {
    private final OrderRepository orderRepository;
    private final NotificationService notificationService;
    public OrderService(OrderRepository orderRepository, NotificationService notificationService) {
        this.orderRepository = orderRepository;
        this.notificationService = notificationService;
    }
    public void createOrder(String orderId, String customerEmail) {
        Order order = new Order(orderId);
        orderRepository.save(order);
        notificationService.send("Đơn hàng " + orderId + " đã được tạo", customerEmail);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("=== DÙNG FILE + EMAIL ===");
        OrderService service1 = new OrderService(new FileOrderRepository(), new EmailService());
        service1.createOrder("ORD001", "user@example.com");
        System.out.println("\n=== DÙNG DATABASE + SMS ===");
        OrderService service2 = new OrderService(new DatabaseOrderRepository(), new SMSNotification());
        service2.createOrder("ORD002", "user@example.com");
        System.out.println("\n✅ OrderService hoạt động với implementation mới mà không cần sửa code!");
    }
}