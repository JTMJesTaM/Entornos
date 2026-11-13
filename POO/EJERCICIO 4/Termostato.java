public class Termostato {
    private int temperatura = 20;

    public Termostato() {
    }

    public void setTemperatura(int temperatura) {
        if (temperatura >= 16 && temperatura <= 30)
            this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }
}
