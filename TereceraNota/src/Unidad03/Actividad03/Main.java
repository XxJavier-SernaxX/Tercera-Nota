package Unidad03.Actividad03;

import java.util.List;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        // Crear lista de libros

        List<Book> books = new ArrayList<>();
        books.add(new Book("100 años de soledad", "Gabriel Garcia", 50000));
        books.add(new Book("1984", "George Orwell", 12.50));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 10.75));

        books.add(new Book("El Gran Gatsby", "F. Scott Fitzgerald", 15.20));
        books.add(new Book("Matar a un ruiseñor", "Harper Lee", 18.00));
        books.add(new Book("Cien años de soledad", "Gabriel García Márquez", 22.50));   

        

        // Crear manejador de archivos
        BookFileHandler handler = new BookFileHandler();

        // Guardar libros en el archivo
        handler.saveBooks(books);

        // Leer y mostrar los libros del archivo
        handler.readBooks();
    }
}

