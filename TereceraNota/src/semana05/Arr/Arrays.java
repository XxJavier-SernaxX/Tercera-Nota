package semana05.Arr;

public class Arrays {
    public static void main(String[] args) {
        // Crear arreglo de objetos Product con mínimo 5 productos
        Product[] productos = {
            new Product("Laptop", 1200.50),
            new Product("Mouse", 25.99),
            new Product("Teclado", 75.00),
            new Product("Monitor", 300.00),
            new Product("Auriculares", 150.75)
        };
        
        // Usar foreach para recorrer el arreglo e imprimir cada producto
        System.out.println("=== Lista de Productos ===");
        double precioTotal = 0; // Variable para acumular el precio total
        for (Product producto : productos) {
            System.out.println("Nombre: " + producto.getName() + " - Precio: $" + producto.getPrice());
            precioTotal += producto.getPrice(); // Sumar el precio del producto al total
        }
        
        System.out.println("\n=== Usando método showInfo ===");
        for (Product producto : productos) {
            producto.showInfo();
        }

        // Mostrar el precio total
        System.out.println("\n=== Precio Total ===");
        System.out.println("El precio total de los productos es: $" + precioTotal);
    }
}
