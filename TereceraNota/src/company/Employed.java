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
        }
       
    }


}

    

