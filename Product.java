public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private int minStockLevel;

    public Product(int id, String name, double price, int quantity, int minStockLevel) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.minStockLevel = minStockLevel;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public int getMinStockLevel() { return minStockLevel; }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isLowStock() {
        return quantity <= minStockLevel;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    @Override
    public String toString() {
        String alert = isLowStock() ? " ⚠ LOW STOCK!" : "";
        return "ID: " + id +
                " | Name: " + name +
                " | Price: ₹" + price +
                " | Qty: " + quantity +
                " | Min Stock: " + minStockLevel +
                " | Value: ₹" + getTotalValue() + alert;
    }
}
