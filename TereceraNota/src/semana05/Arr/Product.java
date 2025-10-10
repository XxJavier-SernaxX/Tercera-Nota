package semana05.Arr;

public class Product {
    private String name;
    private double price;
    
    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    // Método showInfo
    public void showInfo() {
        System.out.println("Producto: " + name + " - Precio: $" + price);
    }
}
