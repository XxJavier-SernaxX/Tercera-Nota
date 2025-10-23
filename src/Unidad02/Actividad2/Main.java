package Unidad02.Actividad2;

import Unidad02.Actividad2.utils.Product;
import Unidad02.Actividad2.utils.Category;
import Unidad02.Actividad2.utils.Order;
import Unidad02.Actividad2.utils.Customer;

public class Main {
    public static void main(String[] args) {

        Category electronics = new Category("Electronics", "Devices and gadgets");

        Product laptop = new Product("Laptop", 3000000);
        Product mouse = new Product("Mouse inalambrico", 250000);
        Product keyboard = new Product("Teclado ", 300000);

        electronics.addProduct(laptop);
        electronics.addProduct(mouse);
        electronics.addProduct(keyboard);

        Customer customer = new Customer("John Doe", "john@example.com");

        Order order1 = new Order("2025-10-19");
        order1.addProduct(laptop);
        order1.addProduct(mouse);

        customer.placeOrder(order1);

        System.out.println(" CATEGORY INFO ");
        System.out.println(electronics.getInfo());

        System.out.println(" PRODUCTS ");
        System.out.println(laptop.getInfo());
        System.out.println(mouse.getInfo());
        System.out.println(keyboard.getInfo());

        System.out.println(" CUSTOMER INFO ");
        System.out.println(customer.getInfo());

        System.out.println(" ORDER INFO ");
        System.out.println(order1.getInfo());
    }
}
