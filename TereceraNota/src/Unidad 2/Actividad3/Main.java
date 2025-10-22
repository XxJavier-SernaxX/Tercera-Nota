package Unidad02.Actividad3;

import Unidad02.Actividad3.utils.Car;
import Unidad02.Actividad3.utils.CarRental;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarRental rental = new CarRental();

        System.out.print("Cuantos carros deseas registrar: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Carro #" + (i + 1));
            System.out.print("Modelo: ");
            String model = sc.nextLine();

            System.out.print("Precio por día: ");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Esta disponible (true/false): ");
            boolean available = sc.nextBoolean();
            sc.nextLine();

            rental.addCar(new Car(model, price, available));
        }

        System.out.println("Carros registrados correctamente");
        rental.showAvailableCars();

        System.out.print("Ingresa el modelo del carro que deseas alquilar: ");
        String modelSearch = sc.nextLine();

        Car car = rental.searchCar(modelSearch);
        if (car != null && car.isAvailable()) {
            System.out.print("Por cuantos dias deseas alquilarlo: ");
            int days = sc.nextInt();
            sc.nextLine();
            double total = rental.calculateTotal(car, days);
            System.out.println("Precio total por " + days + " días: $" + total);
            car.setAvailable(false);
        } else {
            System.out.println("Carro no encontrado o no disponible.");
        }

        System.out.println("Carros disponibles actualizados:");
        rental.showAvailableCars();

        sc.close();
    }
}


