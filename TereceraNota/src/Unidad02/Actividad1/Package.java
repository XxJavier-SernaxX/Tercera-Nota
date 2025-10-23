package Unidad02.Actividad1;

public class Package {
    private String trackingCode;
    private double weight;

    public Package(String trackingCode, double weight) {
        this.trackingCode = trackingCode;
        this.weight = weight;
    }

    public void showPackage() {
        System.out.println("Tracking Code: " + trackingCode + ", Weight: " + weight + " kg");
    }
    
    // Getter para el peso
    public double getWeight() {
        return weight;
    }
    
    // Setter para el peso
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    // Getter para el código de seguimiento
    public String getTrackingCode() {
        return trackingCode;
    }
}

