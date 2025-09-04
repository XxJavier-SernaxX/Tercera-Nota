package company;

public class Employed {

    public String name;
    private double salary;
    public double getSalary() {
        return salary;
    }
    protected String role;
    public void setSalary(double salary) {
        if (salary>0) {
             this.salary = salary;
        }else 

       System.out.println("el salario debe de ser positivo");
    }

    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getRole() {
        return role;
    }


    public void setRole(String role) {
        this.role = role;
    }


    public void increaseSalary(double amount){
        if (amount>0) {
            salary+=amount;
            System.out.println("su nuevo salario es de "+ salary);
            
        }else{
            salary=salary;
        }

    }


}

    

