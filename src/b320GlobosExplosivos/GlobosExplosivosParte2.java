package b320GlobosExplosivos;

import java.util.Random;

public class GlobosExplosivosParte2 {

    private int capacidadMaxima;
    private int aireActual;
    private boolean explotado;

    public GlobosExplosivosParte2(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.aireActual = 0;
        this.explotado = false;
    }

    //aqui se genera el globo con capacidad maxima de entre 10 y 50
    public GlobosExplosivosParte2() {
        Random random = new Random();
        this.capacidadMaxima = random.nextInt(40) + 10;
        this.aireActual = 0;
        this.explotado = false;
    }

    //aqui se infla el globo
    public void inflar(int cantidad) {
        aireActual = aireActual + cantidad;

        if (aireActual >= capacidadMaxima) {
            explotado = true;
        }
        if (explotado) {
            System.out.println("El globo ha explotado.");
            return;
        }
    }
    public boolean explotado() {
        return explotado;
    }

    public String toString() {
        if (explotado) {
            return "El globo ha explotado.";
        } else {
            return "El globo se ha inflado.";

        }
    }
}
