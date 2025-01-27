package b320GlobosExplosivosParte3;

import java.util.Random;

public class GlobosExplosivosParte3 {

    public static final int RANDOM_MAX = 50;
    public static final int RANDOM_MIN = 10;

    private int capacidad;
    private int aire = 0;
    private boolean explotado;


    //aqui se genera el globo con capacidad maxima de entre 10 y 50
    public GlobosExplosivosParte3() {
        Random random = new Random();
        this.capacidad = (RANDOM_MIN + random.nextInt(RANDOM_MAX - RANDOM_MIN + 1));
    }

    public GlobosExplosivosParte3(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    //aqui se infla el globo
    public void inflar(int cantidad) {
        aire = aire + cantidad;
        if (aire >= capacidad) {
            explotado = true;
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