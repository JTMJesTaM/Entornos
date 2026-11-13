public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Java inicial", 120);

        System.out.println(
                "El título del libro es " + libro1.getTitulo() + " y tiene " + libro1.getPaginas() + " páginas");
    }
}
