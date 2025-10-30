package Unidad03.ActividadClase;

public class Gerente extends Empleado {
    private double bono;
    protected Direccion Direccion;

    public Gerente(String nombre, double salarioBase, double bono ,Direccion direccion) {
        super(nombre, salarioBase );
        this.bono = bono;
        this.Direccion = direccion;

    }
    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Bono: " + bono);
        System.out.println("Salario Total: " + calcularSalario());
        calcularSalario();
        System.out.println("Direccion: " + Direccion.getFullAddres());
        

    }
}
