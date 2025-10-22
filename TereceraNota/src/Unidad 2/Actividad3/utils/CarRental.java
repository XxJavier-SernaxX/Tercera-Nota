package Unidad02.Actividad3.utils;

import java.util.ArrayList;

public class CarRental {
    private ArrayList<Car> cars;

    public CarRental() {
        cars = new ArrayList<>();
    }

    public void addCar(Car c) {
        cars.add(c);
    }

    public void showAvailableCars() {
        System.out.println("\n--- Carros disponibles ---");
        boolean found = false;
        for (Car c : cars) {
            if (c.isAvailable()) {
                System.out.println(c.getInfo());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No hay carros disponibles");
        }
    }

    public double calculateTotal(Car c, int days) {
        if (c.isAvailable()) {
            return c.getPricePerDay() * days;
        } else {
            System.out.println("Este carro no está disponible");
            return 0;
        }
    }

    public Car searchCar(String model) {
        for (Car c : cars) {
            if (c.getModel().equalsIgnoreCase(model)) {
                return c;
            }
        }
        System.out.println("Carro no encontrado");
        return null;
    }
}


