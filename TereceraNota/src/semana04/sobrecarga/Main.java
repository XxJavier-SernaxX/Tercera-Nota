package semana04.sobrecarga;

public class Main {
    public static void main(String[] args) {
        
        Product product1 = new Product(); 
        Product product2 = new Product("Laptop", 1200.00);
        Product product3 = new Product("Smartphone", 800.00, 50); 
       

        System.out.println("Product 1:");
        product1.showProduct();

        System.out.println("Product 2:");
        product2.showProduct();

        System.out.println("Product 3:");
        product3.showProduct();

        
        product2.update("Gaming Laptop"); 
        product3.update(850.00); 

        
        System.out.println("Updated Product 2:");
        product2.showProduct();

        System.out.println("Updated Product 3:");
        product3.showProduct();
    }
}
