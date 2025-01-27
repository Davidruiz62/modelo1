package b331BingoSoloBombo;

import java.util.Random;

public class Bombo {
    int cantidadBolas;
    private boolean[] bolas;
    private Random random;

    public Bombo(int cantidadBolas) {
        this.cantidadBolas = cantidadBolas;
        bolas = new boolean[cantidadBolas + 1];
        random = new Random();
    }

    public boolean bolaEstaDentro(int numero) {
         return numero >= 1 && numero<= cantidadBolas && !bolas[numero];
    }

    public int dameBola() {
        int bola;
        do {
            bola = random.nextInt(cantidadBolas + 1);
        } while (!bolaEstaDentro(bola));
        bolas[bola] = true;
        return bola;
    }
    public String toString() {
        String dentro = "Bolas dentro: ";
        String fuera = "Bolas fuera: ";

        for (int i = 1; i <= cantidadBolas; i++) {
            if (bolas[i]) {
                fuera += i + " ";
            } else {
                dentro += i + " ";
            }
        }
        return dentro + "\n" + fuera;
    }
}
