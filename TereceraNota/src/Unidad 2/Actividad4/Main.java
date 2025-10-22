package Unidad02.Actividad4;

import Unidad02.Actividad4.utils.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        inventory.addProduct(new Product("P001", "Mouse inalambrico", 250000));
        inventory.addProduct(new Product("P002", "Teclado ", 300000));
        inventory.addProduct(new Product("P003", "Monitor ", 1200000));

        System.out.println("Productos agregados correctamente");
        inventory.showProducts();

        System.out.print("Ingresa el codigo del producto a buscar: ");
        String code = sc.nextLine();

        Product found = inventory.searchProduct(code);
        if (found != null) {
            System.out.println(" Producto encontrado:");
            System.out.println(found.getInfo());
        }

        sc.close();
    }
}

