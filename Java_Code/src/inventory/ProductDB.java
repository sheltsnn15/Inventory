package inventory;

import java.util.HashMap;

/**
 * R00203947 - Shelton Ngwenya : SDH2
 */

public class ProductDB {

    private HashMap<Integer, Product> products = new HashMap<>();

    public HashMap<Integer, Product> findProduct(int productID)
    {
        if(products.containsKey(productID)) {
            System.out.println(products.get(productID).print());
        } else {
            System.out.println("Product with product id: " + productID + " does not exist");
        }

        return products;
    }

    public void addProduct(Product prod) {
        products.put(prod.getProductID(), prod);
    }

    public void removeProducts(int productID) {
        if(products.containsKey(productID)) {
            products.remove(productID);
            System.out.println("Product at index " + productID + " has been removed");
        } else {
            System.out.println("Product with product id: " + productID + "does not exist");
        }
    }

    public void showAllProducts() {
        if(!products.isEmpty()) {
            products.forEach((key, value) -> System.out.println(value.print()));
        } else {
            System.out.println("The product database is currently empty");
        }
    }
}
