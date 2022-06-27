package inventory;

/**
 * R00203947 - Shelton Ngwenya : SDH2
 */

public class OrderDetails {

    private Product product;
    private int quantity;

    public OrderDetails(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
