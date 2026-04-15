package enums;

import com.restaurant.system.Order;

public class RestaurantService {

    public static void main(String[] args) {
        /*
        Order order = new Order(OrderStatus.INITIALISED);

        System.out.println("Order is validated by operator");

        order.setStatus(OrderStatus.ACTIVE);

        System.out.println("Cooker is checking for ACTIVE order");

        if (order.getStatus() == OrderStatus.ACTIVE) {
            System.out.println("It can pe picked");
        }

        order.setStatus(OrderStatus.PROCESSING);

        System.out.println("Cooker finished");

        order.setStatus(OrderStatus.PROCESSED);

        System.out.println("Order is delivered");

        if (order.getStatus() == OrderStatus.PROCESSED) {
            System.out.println("Can be delivered");
        }

        order.setStatus(OrderStatus.FINISHED);
*/

        OrderStatus.ACTIVE.setStatusIndex(4);
        OrderStatus.FINISHED.setStatusIndex(1);
        OrderStatus.PROCESSED.setStatusIndex(2);
        OrderStatus.INITIALISED.setStatusIndex(3);

        OrderStatus orderStatus = OrderStatus.getByIndex(3);

        if(orderStatus.equals(OrderStatus.ACTIVE)){

        }

        System.out.println(OrderStatus.PROCESSING.getStatusIndex());


    }

    void showOrdersInRestaurant(Order[] orders) {

        for (Order order : orders) {
            switch (order.getStatus()) {
                case ACTIVE:
                case PROCESSING:
                case PROCESSED:
                    System.out.println("Order with id" + order.getOrderId() + " is in restaurant");
                    break;
                case INITIALISED:
                    System.out.println("Order with id" + order.getOrderId() + " has to be validated");
                    break;
                case FINISHED:
                    System.out.println("Order with id" + order.getOrderId() + "is delivered to client");
                    break;
            }

        }

    }
}
