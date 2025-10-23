package Unidad02.Actividad2.utils;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getInfo() {
        return "Product: " + name + ", Price: $" + price;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    // Setter para el precio
    public void setPrice(double price) {
        this.price = price;
    }
}

