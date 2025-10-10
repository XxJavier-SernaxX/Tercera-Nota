package semana05.Employed;

public class Main {
    public static void main(String[] args) {
        // Crear empleados con diferentes roles
        Employed manager = new Employed();
        manager.name = "Ana García";
        manager.role = "manager";
        
        Employed developer = new Employed();
        developer.name = "Carlos López";
        developer.role = "developer";
        
        Employed designer = new Employed();
        designer.name = "María Rodríguez";
        designer.role = "designer";
        
        Employed unknown = new Employed();
        unknown.name = "Pedro Sánchez";
        unknown.role = "analyst";
        
        // Mostrar información de cada empleado
        System.out.println("=== EMPLEADOS Y SUS RESPONSABILIDADES ===\n");
        
        System.out.println("Empleado: " + manager.name);
        manager.showResponsabilities();
        System.out.println();
        
        System.out.println("Empleado: " + developer.name);
        developer.showResponsabilities();
        System.out.println();
        
        System.out.println("Empleado: " + designer.name);
        designer.showResponsabilities();
        System.out.println();
        
        System.out.println("Empleado: " + unknown.name);
        unknown.showResponsabilities();
        System.out.println();
    }
}
