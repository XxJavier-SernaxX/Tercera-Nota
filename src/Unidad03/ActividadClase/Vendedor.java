package Unidad03.ActividadClase;

public class Vendedor extends Empleado {
    private double ventas;
    private double comision;
    protected Direccion direccion;

    public Vendedor(String nombre, double salarioBase, double ventas , double comision,Direccion direccion  ) {
        super(nombre, salarioBase);
        this.ventas = ventas;
        this.comision = comision;
        this.direccion = direccion; 
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (ventas * comision );  

    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Direccion: " + direccion.getFullAddres());
        System.out.println("Ventas: " + ventas);
        System.out.println("Comision: " + comision);
        System.out.println("Salario Total: " + calcularSalario());
        calcularSalario();

    }
}
