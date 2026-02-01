import java.util.Scanner;

public class InventoryApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InventoryManager manager = new InventoryManager();

        while (true) {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Delete Product");
            System.out.println("6. Total Inventory Value");
            System.out.println("7. Show Low Stock Products");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();

                        System.out.print("Enter Quantity: ");
                        int qty = sc.nextInt();

                        System.out.print("Enter Minimum Stock Level: ");
                        int min = sc.nextInt();

                        manager.addProduct(new Product(id, name, price, qty, min));
                        break;

                    case 2:
                        manager.viewProducts();
                        break;

                    case 3:
                        System.out.print("Enter ID to search: ");
                        Product p = manager.searchProduct(sc.nextInt());
                        System.out.println(p != null ? p : "❌ Product not found");
                        break;

                    case 4:
                        System.out.print("Enter ID: ");
                        int uid = sc.nextInt();
                        System.out.print("Enter new Quantity: ");
                        manager.updateQuantity(uid, sc.nextInt());
                        break;

                    case 5:
                        System.out.print("Enter ID to delete: ");
                        manager.deleteProduct(sc.nextInt());
                        break;

                    case 6:
                        manager.totalInventoryValue();
                        break;

                    case 7:
                        manager.showLowStockProducts();
                        break;

                    case 8:
                        System.out.println("👋 Exiting...");
                        return;

                    default:
                        System.out.println("❌ Invalid choice");
                }

            } catch (Exception e) {
                System.out.println("⚠ Invalid input! Please try again.");
                sc.nextLine();
            }
        }
    }
}
