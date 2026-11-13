public class Main {
    public static void main(String[] args) {
        Marcador p1 = new Marcador();
        Marcador p2 = new Marcador();

        p1.incrementar();
        p1.incrementar();
        p2.incrementar();

        System.out.println("Marcador 1: " + p1.puntos + "\nMarcador 2: " + p2.puntos);
    }
}
