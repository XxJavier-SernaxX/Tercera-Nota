package company;

public class Main {

    public static void main(String[] args){
         Employed employed1 = new Employed();
        employed1.name = "Javier";
        employed1.role = "Programer";
        employed1.setSalary(1000); 
        employed1.increaseSalary(-500);
       
    
        System.out.println(employed1.getSalary()); 
        System.out.println(employed1.getName());
        System.out.println(employed1.getRole());
    }
       
    
}
