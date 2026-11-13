package POO;

public class PersonaPOO {

    private String nombre;
    private int edad;

    public PersonaPOO(String nombreNuevo, int edadNuevo) {
        this.nombre = nombreNuevo;
        this.edad = edadNuevo;
    }

    public void mostrarInformacion() {
        System.out.println("La persona " + this.nombre + " tiene " + this.edad + " años");
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edadNuevo) {
        this.edad = edadNuevo;
    }

    public static void main(String[] args) {
        PersonaPOO persona1 = new PersonaPOO("Pitu", 12);
        PersonaPOO persona2 = new PersonaPOO("Aeiou", 51);
        persona1.mostrarInformacion();
        persona2.mostrarInformacion();
        persona1.setEdad(17);
        persona1.mostrarInformacion();
    }
}
