package Unidad03.Actividad03;

import java.io.*;
import java.util.*;

public class BookFileHandler {

    private static final String FILE_NAME = "books.txt";

    // Método para guardar libros
    public void saveBooks(List<Book> books) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Book book : books) {
                writer.write(book.toString());
                writer.newLine(); // salto de línea
            }
            System.out.println("el libro se ha guardado correctamente");
        } catch (IOException e) {
            System.out.println("Error al guardar el libro: " + e.getMessage());
        } finally {
            System.out.println("Operacion finalizada (saveBooks).");
        }
    }

    // Método para leer libros
    public void readBooks() {
        File file = new File(FILE_NAME);

        // Validar existencia antes de leer
        if (!file.exists()) {
            System.out.println("el archivo no existe. No hay nada que leer.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("\nlos libros se han leido correctamente");
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String title = parts[0];
                    String author = parts[1];
                    double price = Double.parseDouble(parts[2]);
                    System.out.println("Titulo: " + title + " | Autor: " + author + " | Precio: $" + price);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            System.out.println("Operacion finalizada (readBooks).");
        }
    }
}
