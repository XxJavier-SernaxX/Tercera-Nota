package Unidad02.Actividad3.utils;

public class Car {
    private String model;
    private double pricePerDay;
    private boolean available;

    public Car(String model, double pricePerDay, boolean available) {
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.available = available;
    }

    public String getModel() {
        return model;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getInfo() {
        return "Modelo: " + model + " | Precio por día: $" + pricePerDay + " | Disponible: " + (available ? "Sí" : "No");
    }
}


