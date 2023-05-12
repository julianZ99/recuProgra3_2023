import java.time.LocalDate;

public class Alquiler {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private int kilometros;
    private double costo;
    private Sucursal sucursalInicio;
    private Sucursal sucursalFinal;

    public Alquiler(Cliente cliente, Vehiculo vehiculo, Sucursal sucursalInicio) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = LocalDate.now();
        this.fechaFinal = LocalDate.now();
        this.costo = 0;
        this.kilometros=0;
        this.sucursalInicio = sucursalInicio;
        this.sucursalFinal = null;
    }

    public Alquiler(Cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio, LocalDate fechaFinal, double costo,int kilometros, Sucursal sucursalInicio, Sucursal sucursalFinal) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.costo = costo;
        this.kilometros=kilometros;
        this.sucursalInicio = sucursalInicio;
        this.sucursalFinal = sucursalFinal;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Sucursal getSucursalInicio() {
        return sucursalInicio;
    }

    public void setSucursalInicio(Sucursal sucursalInicio) {
        this.sucursalInicio = sucursalInicio;
    }

    public Sucursal getSucursalFinal() {
        return sucursalFinal;
    }

    public void setSucursalFinal(Sucursal sucursalFinal) {
        this.sucursalFinal = sucursalFinal;
    }

    public void calculoCosto(double precioDia){
        this.costo=9;
    }

    public void calculoCosto(){
        this.costo=kilometros*50+(fechaFinal.getDayOfYear()-fechaInicio.getDayOfYear());
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "cliente=" + cliente.getNombre() +
                ", vehiculo=" + vehiculo.getModelo() +
                ", fechaInicio=" + fechaInicio +
                ", fechaFinal=" + fechaFinal +
                ", costo=" + costo +
                ", sucursalInicio=" + sucursalInicio +
                ", sucursalFinal=" + sucursalFinal +
                '}';
    }
}
