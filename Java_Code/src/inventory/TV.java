package inventory;

/**
 * R00203947 - Shelton Ngwenya : SDH2
 */

public class TV extends Product {

    enum  Type{
        LED, LCD
    }

    private String make;
    private String model;
    private Type type;

    public TV(ProductDB db, String name, String description, double price, String make, String model, Type type) {
        super(name, description, price);
        this.make = make;
        this.model = model;
        this.type = type;
        db.addProduct(this);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return super.name;
    }

    public void setName(String name) {
        super.name = name;
    }

    @Override
    public String print() {
        return "\n ----------TV Information----------" +
                "\nTV ID: " + this.getProductID() +
                "\nTV Name: " + this.name +
                "\nTV Make: " + this.make +
                "\nTV Model: " + this.model +
                "\nTV Type: " + this.type +
                "\nTV Price: " + this.getPrice() +
                "\nTV Description: " + this.getDescription();
    }

}
