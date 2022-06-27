package inventory;

import java.util.ArrayList;

/**
 * R00203947 - Shelton Ngwenya : SDH2
 */

public class Order {
    private ArrayList<OrderDetails> order = new ArrayList<>();

    public Order(ArrayList<OrderDetails> order) {
        this.order = order;
    }

    public ArrayList<OrderDetails> getOrderDetails(int index) {
        try {
            System.out.println(order.get(index).getProduct().print() + "\nQuantity: " + order.get(index).getQuantity());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        return order;
    }

    public void getAllOrderDetails(){
        for (int i = 0; i < order.size(); i++) {
            System.out.println(order.get(i).getProduct().print() + "\nQuantity = " + order.get(i).getQuantity());
        }
    }


    public void addOrderDetails(OrderDetails orderDetails) {
        this.order.add(orderDetails);
    }

    public void removeOrderDetails(int index) {
        try {
            order.remove(index);
            System.out.println("Index " + index + " has been removed");
        } catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
