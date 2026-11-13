package POO.PROYECTO_POO.CLASES;

public class DesarrolladorJunior extends Empleado {
    private String tutorAsignado;
    private ProyectoSoftware proyectoAsignado;

    public DesarrolladorJunior(String idEmpleado, String nombre, double tarifaHora, boolean disponible,
            String tutorAsignado) {
        super(idEmpleado, nombre, tarifaHora, disponible);
    }
}