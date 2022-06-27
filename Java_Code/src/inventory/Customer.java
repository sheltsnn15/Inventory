package inventory;

import java.util.ArrayList;

/**
 * R00203947 - Shelton Ngwenya : SDH2
 */

public class Customer {
    private String name, address;
    private ArrayList<Order> cusOrder = new ArrayList<>();

    public Customer(String name, String address, ArrayList<Order> cusOrder) {
        this.name = name;
        this.address = address;
        this.cusOrder = cusOrder;
    }

    public ArrayList<Order> getOrder(int index) {
        try{
            cusOrder.get(index);
            showAllOrders();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        return cusOrder;
    }

    public void addOrder(Order cusOrder) {
        this.cusOrder.add(cusOrder);
    }

    public void removeOrder(int index) {
        try {
            cusOrder.remove(index);
            System.out.println("Index " + index + " has been removed");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index " + index + " does not exists");
        }
    }

    public void showAllOrders(){
        System.out.println(this.getName() + " " + this.getAddress());
        for (int i = 0; i < cusOrder.size(); i++) {
            cusOrder.get(i).getAllOrderDetails();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
