package inventory;

import java.util.ArrayList;

/**
 * R00203947 - Shelton Ngwenya : SDH2
 */
 
public class Tester {
    public static void main(String[] args) {
        ProductDB db = new ProductDB();

        Phone phone1 = new Phone(db, "13", "A15 Bionic", 12, Phone.Make.Apple, "iPhone", "128GB");
        Phone phone2 = new Phone(db, "S21 Ultra", "Snapdragon 888", 5, Phone.Make.Samsung, "Galaxy", "256GB");
        Phone phone3 = new Phone(db, "XR20", "Exynos 2100", 3, Phone.Make.Nokia, "XR", "128GB");
        Phone phone4 = new Phone(db, "X", "A11 Bionic", 9, Phone.Make.Apple, "iPhone", "256GB");

        TV tv1 = new TV(db, "QN800", "Hybrid Log-Gamma (HLG)", 2999, "Samsung", "8k", TV.Type.LCD);
        TV tv2 = new TV(db, "TX-65JZ2000B", "65-inch 4K Pro Edition OLED Smart TVArray", 2149, "Panasonic", "8k", TV.Type.LED);
        TV tv3 = new TV(db, "OLED65C16LA ", "UHD OLED Smart inventory.TV with Self- lit Pixel Technology", 2749, "LG", "8k", TV.Type.LCD);

        OrderDetails orderDetails1 = new OrderDetails(phone2, 5);
        OrderDetails orderDetails2 = new OrderDetails(tv1, 2);
        OrderDetails orderDetails3 = new OrderDetails(tv3, 1);

        ArrayList<OrderDetails> orderDetailsArr = new ArrayList<>();
        orderDetailsArr.add(orderDetails1);
        orderDetailsArr.add(orderDetails2);
        orderDetailsArr.add(orderDetails3);

        Order order = new Order(orderDetailsArr);

        ArrayList<Order> ordersArr = new ArrayList<>();
        ordersArr.add(order);

        Customer cusOrders = new Customer("Godzilla", "Cork", ordersArr);

        cusOrders.showAllOrders();

       //db.showAllProducts();
    }

}
