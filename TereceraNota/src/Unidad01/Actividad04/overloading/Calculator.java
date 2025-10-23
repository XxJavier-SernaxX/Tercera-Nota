package Unidad01.Actividad04.overloading;

public class Calculator {

    public int sumar(int numA,int numB){

        return numA+numB;
    }
    public int restar(int numA,int numB){

        return numA-numB;
    }
    public int multiplicar(int numA,int numB){

        return numA*numB;
    }
    public int dividir(int numA,int numB){

        
        try {
            return numA/numB;
        } catch (Exception e) {
            System.out.println("No es posibles las divisiones entre cero ");
          return 0;
    }
    
 
    }
}