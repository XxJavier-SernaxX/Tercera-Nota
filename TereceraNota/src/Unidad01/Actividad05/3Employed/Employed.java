package Unidad01.Actividad05.Employed3;

public class Employed {
    public String name;
    public String role;
    
    public void showResponsabilities() {
        switch (role) {
            case "manager":
                System.out.println("Manager responsibilities:");
               
                break;
            case "developer":
                System.out.println("Developer responsibilities:");
               
                break;
            case "designer":
                System.out.println("Designer responsibilities:");
              
                break;
            default:
                System.out.println("Unknown role: " + role);
               
                break;
        }
    }
}
