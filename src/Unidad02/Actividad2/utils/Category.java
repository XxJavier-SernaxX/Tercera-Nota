package Unidad02.Actividad2.utils;

import java.util.ArrayList;

public class Category {
    private String name;
    private String description;
    private ArrayList<Product> products;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public String getInfo() {
        return "Category: " + name + " (" + description + "), Total products: " + products.size();
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getProductCount() {
        return products.size();
    }
}

