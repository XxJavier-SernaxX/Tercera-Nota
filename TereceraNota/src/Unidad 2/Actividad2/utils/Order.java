package Unidad02.Actividad2.utils;

import java.util.ArrayList;

public class Order {
    private String date;
    private double total;
    private ArrayList<Product> products; 

    public Order(String date) {
        this.date = date;
        this.products = new ArrayList<>();
        this.total = 0.0;
    }

    public void addProduct(Product p) {
        products.add(p);
        total += p.getPrice();
    }

    public String getInfo() {
        return "Order date: " + date + ", Total: $" + total + ", Products: " + products.size();
    }
    
    // Getters
    public String getDate() {
        return date;
    }
    
    public double getTotal() {
        return total;
    }
    
    public int getProductCount() {
        return products.size();
    }
}

