
        public class App {
        
            public  static class BankAccount {
                //atributos
        String owner;
        String accountNumber;
        double balance;
        
        //methods
        void deposit (double amount){
            balance += amount;
            System.out.println( " acaba de depositar "+amount+" su nuevo balance es de :"+balance);
        }
        
        void withdraw (double amount){
            if (balance >= amount){
                balance -= amount;
                System.out.println("reitiro "+amount+"ahora su balance es de "+balance);
            }else 
            System.out.println("no tiene el suficiente saldo ");
        }

        void showbalance (){
            System.out.println("su balance es de "+balance);
        }

        }
    public static void main(String[] args) throws Exception {
        BankAccount account1 = new BankAccount();
        account1.owner = "Serna";
        account1.balance = 5000000;
        account1.accountNumber= "109165";
       System.out.print("la cuenta de " + account1.owner + " tiene un balance de " + account1.balance + " y esta registrado con el siguiente numero bancario " + account1.accountNumber);
        account1.deposit(1000000);

    }
}
