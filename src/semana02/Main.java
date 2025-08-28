package src.semana02;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Product account1 = new Product();
        account1.name = "lapiz";
        account1.price = 1000;
        account1.quantity = 10;
        account1.sell(5);
        account1.restock(10);
       account1.showproduct();

       Product account2 = new Product();
        account2.name = "celular";
        account2.price = 5000000;
        account2.quantity = 5;
        account2.sell(7);
        account2.restock(4);
       account2.showproduct();
    }


    
}
