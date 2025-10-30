package Unidad03.ActividadClase;

public class Direccion {
    private String ciudad;
    private String calle;   

    public Direccion(String ciudad, String calle) {
        this.ciudad = ciudad;
        this.calle = calle;
    }
    public String getFullAddres() {
        return calle + " ,"+ciudad;
    }
}
