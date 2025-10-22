package Unidad02.Actividad4.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {
    private ArrayList<Product> products;
    private HashMap<String, Product> catalog;

    public Inventory() {
        products = new ArrayList<>();
        catalog = new HashMap<>();
    }

    public void addProduct(Product p) {
        products.add(p);
        catalog.put(p.getCode(), p);
    }

    public void showProducts() {
        System.out.println("\n--- Lista de productos ---");
        for (Product p : products) {
            System.out.println(p.getInfo());
        }
    }

    public Product searchProduct(String code) {
        try {
            Product p = catalog.get(code);
            if (p == null) {
                throw new Exception("No existe un producto con ese código.");
            }
            return p;
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
            return null;
        }
    }
}

