package Unidad02.Actividad1;

public class Main {
    public static void main(String[] args) {
        Package p1 = new Package("ABC123", 5.0);

        Package p2 = p1;

        p2.setWeight(8.5);

        System.out.println("Usando p1:");
        p1.showPackage();

        System.out.println("Usando p2:");
        p2.showPackage();

        changeWeight(p1, 10.0);

        System.out.println("Después de changeWeight():");
        p1.showPackage();
    }

    public static void changeWeight(Package p, double newWeight) {
        p.setWeight(newWeight);
    }
}

