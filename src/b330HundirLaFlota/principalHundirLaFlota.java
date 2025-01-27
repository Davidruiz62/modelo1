package b330HundirLaFlota;
import java.util.Scanner;

public class principalHundirLaFlota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tablero tablero = new Tablero();

        System.out.println("Jugador 1: Coloca tus botes salvavidas.");
        int barcosAColocar = 5;

        // aqui el jugador uno coloca todos sus barcos
        for (int i = 0; i < barcosAColocar; i++) {
            System.out.println("Introduce las coordenadas del barco " + (i + 1) + " (fila y columna, entre 0 y 9):");
            int fila, columna;
            while (true) {
                System.out.print("Fila: ");
                fila = scanner.nextInt();
                System.out.print("Columna: ");
                columna = scanner.nextInt();

                if (fila >= 0 && fila < 10 && columna >= 0 && columna < 10 && !tablero.hayBarco(fila, columna)) {
                    tablero.situarParteBarco(fila, columna);
                    break;
                } else {
                    System.out.println("Ya hay un barco en estas coordenadas o es posible que estés intentando colocar fuera del tablero.");
                }
            }
        }

        System.out.println("Le toca al jugador 2 disparar a los barcos!");

        // aqui le toca al jugador dos disparar
        while (!tablero.estaTodoHundido()) {
            System.out.println("Jugador 2: Introduce las coordenadas para disparar (fila y columna, entre 0 y 9):");
            int fila, columna;
            while (true) {
                System.out.print("Fila: ");
                fila = scanner.nextInt();
                System.out.print("Columna: ");
                columna = scanner.nextInt();

                if (fila >= 0 && fila < 10 && columna >= 0 && columna < 10 && !tablero.hayDisparo(fila, columna)) {
                    tablero.disparar(fila, columna);
                    break;
                } else {
                    System.out.println("Repite el disparo, las coordenadas que has puesto están fuera del tablero o ya has disparado en estas coordenadas.");
                }
            }

            System.out.println("Estado actual del tablero:");
            tablero.imprimirTableroDisparos();
        }

        System.out.println("Se ha termindo el juego, todos los barcos están hundidos.");
    }
}
