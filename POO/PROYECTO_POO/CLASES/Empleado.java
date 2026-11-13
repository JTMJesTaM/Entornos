package POO.PROYECTO_POO.CLASES;

public abstract class Empleado {
    protected String idEmpleado;
    protected String nombre;
    protected double tarifaHora;
    protected boolean disponible;

    public Empleado(String idEmpleado, String nombre, double tarifaHora, boolean disponible) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.tarifaHora = tarifaHora;
        this.disponible = disponible;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public double calcularCosteJornada(int horas) {
        return horas * tarifaHora;
    }

    public abstract void mostrarFicha();

    public abstract boolean puedeAsignarseAProyecto(int proyectosActuales);
}
