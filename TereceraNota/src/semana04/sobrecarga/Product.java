package semana04.sobrecarga;


public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
        this.name = "Teclado";
        this.price = 0.0;
        this.quantity = 0;
    }

   
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0; 
    }

 
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void showProduct() {
        System.out.println("Product Name: " + this.name);
        System.out.println("Price: $" + this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.println();
    }

    public void update(String name) {
        this.name = name;
    }

    public void update(double price) {
        this.price = price;
    }
}
