package Unidad03.Actividad03;


public class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    // Para guardar en el archivo como texto
    @Override
    public String toString() {
        return title + "," + author + "," + price;
    }
}

