package inventory;

/**
 * R00203947 - Shelton Ngwenya : SDH2
 */

public class Phone extends Product {

    enum Make{
        Apple, Samsung, Nokia
    }

    private Make make;
    private String model, storage;

    public Phone(ProductDB db, String name, String description, double price, Make make, String model, String storage) {
        super(name, description, price);
        this.make = make;
        this.model = model;
        this.storage = storage;
        db.addProduct(this);
    }

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String print() {
        return "\n ----------Phone Information----------" +
                "\nPhone ID: " + this.getProductID() +
                "\nPhone Name: " + this.name +
                "\nPhone Make: " + this.make +
                "\nPhone Model: " + this.model +
                "\nPhone Storage: " + this.storage +
                "\nPhone Price: " + this.getPrice() +
                "\nPhone Description: " + this.getDescription();
    }
}