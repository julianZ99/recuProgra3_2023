public class Cliente {
    private String nombre;
    private int dni;
    private boolean registroHabilitado;

    public Cliente(String nombre, int dni, boolean registroHabilitado) {
        this.nombre = nombre;
        this.dni = dni;
        this.registroHabilitado = registroHabilitado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isRegistroHabilitado() {
        return registroHabilitado;
    }

    public void setRegistroHabilitado(boolean registroHabilitado) {
        this.registroHabilitado = registroHabilitado;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", registroHabilitado=" + registroHabilitado +
                '}';
    }
}
