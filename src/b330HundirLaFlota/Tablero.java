package b330HundirLaFlota;

public class Tablero {

    private boolean[][] barcos = new boolean[10][10];
    private boolean[][] tiros = new boolean[10][10];
    private int numPartesBarco = 0;
    private int numAciertos = 0;

    public void situarParteBarco(int fil, int col) {
        if (fil >= 0 && fil < 10 && col >= 0 && col < 10 && !barcos[fil][col]) {
            barcos[fil][col] = true;
            numPartesBarco++;
        } else {
            System.out.println("Coordenadas no válidas, es posible que tengas un barco puesto en estas coordenadas.");
        }
    }

    public boolean estaTodoHundido() {
        return numAciertos == numPartesBarco;
    }

    public boolean hayDisparo(int fil, int col) {
        if (fil >= 0 && fil < 10 && col >= 0 && col < 10) {
            return tiros[fil][col];
        }
        return false;
    }

    public boolean hayBarco(int fil, int col) {
        if (fil >= 0 && fil < 10 && col >= 0 && col < 10) {
            return barcos[fil][col];
        }
        return false;
    }

    public void disparar(int fil, int col) {
        if (fil >= 0 && fil < 10 && col >= 0 && col < 10 && !tiros[fil][col]) {
            tiros[fil][col] = true;
            if (barcos[fil][col]) {
                numAciertos++;
                System.out.println("¡Tocado!");
            } else {
                System.out.println("¡Agua!");
            }
        } else {
            System.out.println("Disparo no válido, ya has disparado en estas coordenadas.");
        }
    }

    public void imprimirTableroDisparos() {
        System.out.println("Tablero de disparos:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tiros[i][j] ? (barcos[i][j] ? "X " : "O ") : ". ");
            }
            System.out.println();
        }
    }

    public void imprimirTableroBarcos() {
        System.out.println("Tablero de barcos:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(barcos[i][j] ? "B " : ". ");
            }
            System.out.println();
        }
    }
}
