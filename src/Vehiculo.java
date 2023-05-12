import java.util.UUID;

public class Vehiculo {
    private String modelo;
    private Clase clase;
    private int kilometraje;
    private int year;
    private String ID;

    public Vehiculo(String modelo, Clase clase, int kilometraje, int year) {
        this.modelo = modelo;
        this.clase = clase;
        this.kilometraje = kilometraje;
        this.year = year;
        this.ID = UUID.randomUUID().toString();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return
                "modelo='" + modelo + '\'' +
                ", clase=" + clase +
                ", kilometraje=" + kilometraje +
                ", year=" + year +
                ", ID='" + ID + '\'' +
                '}';
    }
}
