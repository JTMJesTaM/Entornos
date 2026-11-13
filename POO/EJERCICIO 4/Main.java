public class Main {
    public static void main(String[] args) {
        Termostato term = new Termostato();
        System.out.println("La temperatura actual es " + term.getTemperatura());
        term.setTemperatura(24);
        System.out.println("La temperatura actual es " + term.getTemperatura());
        term.setTemperatura(35);
        System.out.println("La temperatura actual es " + term.getTemperatura());
    }
}
