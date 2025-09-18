package semana04.overloading;

public class Main {
    public static void main(String[] args) throws Exception {

   
    Calculator cal= new Calculator();

    System.out.println(cal.sumar(2, 4));
    System.out.println(cal.restar(2, 4));
    System.out.println(cal.multiplicar(2, 4));
    System.out.println(cal.dividir(4, 0));

     }
}
