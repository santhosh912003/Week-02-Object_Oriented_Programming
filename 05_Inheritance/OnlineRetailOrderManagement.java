public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order order = new Order(101, "2024-03-28");
        order.getOrderStatus();

        ShipperOrder shipperOrder = new ShipperOrder(102, "2024-03-29", 456789);
        shipperOrder.getOrderStatus();

        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2024-03-30", 987654, "2024-04-05");
        deliveredOrder.getOrderStatus();
    }
}

class Order {
    int orderId;
    String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    void getOrderStatus() {
        System.out.println("Order ID: " + this.orderId + ", Order Date: " + orderDate);
    }
}

class ShipperOrder extends Order {
    int trackingNumber;

    public ShipperOrder(int orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    void getOrderStatus() {
        System.out.println("Shipping Order -> Order ID: " + this.orderId +
                ", Order Date: " + orderDate +
                ", Tracking Number: " + this.trackingNumber);
    }
}

class DeliveredOrder extends ShipperOrder {
    String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    void getOrderStatus() {
        System.out.println("Delivered Order -> Order ID: " + this.orderId +
                ", Order Date: " + orderDate +
                ", Tracking Number: " + this.trackingNumber +
                ", Delivery Date: " + this.deliveryDate);
    }
}
