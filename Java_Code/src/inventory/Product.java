package inventory;

/**
 * R00203947 - Shelton Ngwenya : SDH2
 */

public abstract class Product {

    private static int nextId = 0;//static because all instances of product class will refer to this var, including inherited classes
    protected String name;
    private String description;
    private int productID;
    private double price;

    public Product(String name, String description, double price) {
        this.productID = Product.nextId++;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract String print();
}
