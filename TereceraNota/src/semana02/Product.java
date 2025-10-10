package semana02;

public class Product {

  
        // atributos
        String name;
        double price;
        int quantity;

        // methods
        void sell(int amount) {
            if (amount <= quantity) {
                quantity -= amount;

                System.out.println("la cantidad en estock que queda es de "+quantity+" ustede acaba de comprar "+amount);

            } else {

                System.out.println("no se encuantran la cantidad de unidades de este objeto ,la cantidad es de "+quantity+" y usted quiere comprar "+amount);
            }

        }

        void restock(double amount) {
            quantity+=amount;
            System.out.println("la nueva cantidad del producto es de "+quantity);
        }

        void showproduct() {
            System.out.println("el producto tiene nombre de  " + name + " tiene el siguiente precio " + price
                    + " y tiene un acantidad de productos de " + quantity);
        }

    }
