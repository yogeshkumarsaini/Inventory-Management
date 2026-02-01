import java.util.ArrayList;
import java.util.List;

public class InventoryManager {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("✅ Product added successfully!");
        if (product.isLowStock()) {
            System.out.println("🚨 ALERT: This product is already low on stock!");
        }
    }

    public void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("⚠ Inventory is empty.");
            return;
        }
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public Product searchProduct(int id) {
        for (Product p : products) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public void updateQuantity(int id, int qty) {
        Product p = searchProduct(id);
        if (p != null) {
            p.setQuantity(qty);
            System.out.println("🔄 Quantity updated!");
            if (p.isLowStock()) {
                System.out.println("🚨 ALERT: Stock is below minimum level!");
            }
        } else {
            System.out.println("❌ Product not found.");
        }
    }

    public void deleteProduct(int id) {
        Product p = searchProduct(id);
        if (p != null) {
            products.remove(p);
            System.out.println("🗑 Product removed!");
        } else {
            System.out.println("❌ Product not found.");
        }
    }

    public void totalInventoryValue() {
        double total = 0;
        for (Product p : products) {
            total += p.getTotalValue();
        }
        System.out.println("💰 Total Inventory Value: ₹" + total);
    }

    public void showLowStockProducts() {
        boolean found = false;
        for (Product p : products) {
            if (p.isLowStock()) {
                System.out.println("⚠ LOW STOCK ALERT → " + p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("✅ No low stock products.");
        }
    }
}
