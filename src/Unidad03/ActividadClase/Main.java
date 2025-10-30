package Unidad03.ActividadClase;

public class Main {
    public static void main(String[] args) {
        Direccion d1 = new Direccion("Bogota", "Calle 123");
        Direccion d2 = new Direccion("Medellin", "Carrera 45");


         Gerente gerente = new Gerente("Ana Gomez", 3000.0, 800.0, d2);
        gerente.mostrarInformacion();

   
       
    }
}
