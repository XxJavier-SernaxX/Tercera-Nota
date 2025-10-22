package Unidad02.Actividad2.utils;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String email;
    private ArrayList<Order> orders;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order o) {
        orders.add(o);
    }

    public String getInfo() {
        return "Customer: " + name + " (" + email + "), Orders: " + orders.size();
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getOrderCount() {
        return orders.size();
    }
}

