# 📦 Inventory Management System

A **console-based Inventory Management System** built using **Java and OOP principles**.  
This application helps manage products, track stock levels, and generate low stock alerts.

---

## 🚀 Features

✔ Add new product  
✔ View all products  
✔ Search product by ID  
✔ Update product quantity  
✔ Delete product  
✔ Calculate total inventory value  
✔ 🚨 Low Stock Alert system  
✔ Exception handling for invalid input  
✔ Menu-driven interface  
✔ Uses ArrayList for data storage  

---

## 🧱 Project Structure

| Class | Description |
|------|-------------|
| `Product` | Stores product details like ID, name, price, quantity, and minimum stock level |
| `InventoryManager` | Handles inventory operations (add, search, update, delete, alerts) |
| `InventoryApp` | Main class with menu-driven user interface |

---

## ⚙️ How It Works

The system allows users to manage inventory through a menu:

1. Add Product  
2. View Products  
3. Search Product  
4. Update Quantity  
5. Delete Product  
6. Total Inventory Value  
7. Show Low Stock Products  
8. Exit  

If a product's quantity goes **below the minimum stock level**, the system shows:

```
⚠ LOW STOCK ALERT
```

---

## 🖥 Technologies Used

- Java  
- OOP (Object-Oriented Programming)  
- ArrayList (Java Collections)  
- Exception Handling  

---

## ▶️ How to Run

1. Clone the repository  
2. Open in any Java IDE (IntelliJ / Eclipse / VS Code)  
3. Compile all files  
4. Run `InventoryApp.java`

---

## 📌 Example Product Output

ID: 101 | Name: Keyboard | Price: ₹500 | Qty: 5 | Min Stock: 3 | Value: ₹2500

If stock is low:

ID: 102 | Name: Mouse | Price: ₹300 | Qty: 2 | Min Stock: 3 | Value: ₹600 ⚠ LOW STOCK!

---

## 🎯 Learning Concepts

- Classes & Objects  
- Encapsulation  
- Collections (ArrayList)  
- Loops & Conditions  
- Exception Handling  
- Menu-driven program design  


