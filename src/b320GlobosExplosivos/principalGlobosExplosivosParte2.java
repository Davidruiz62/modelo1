package b320GlobosExplosivos;
import java.util.Scanner;

public class principalGlobosExplosivosParte2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GlobosExplosivosParte2 globo = new GlobosExplosivosParte2(10);

        System.out.println("Bienvenido al juego del Globo Explosivo.");
        System.out.println("Estado inicial del globo: " + globo);

        int turno = 1;
        boolean ganador = false;

        while (!globo.explotado()) {
            System.out.print("Usuario " + turno +" ¿Cuánto aire quieres introducir?: ");
            int aire = scanner.nextInt();

            if (aire <= 0) {
                System.out.println("No se puede introducir una cantidad negativa de aire.");
                continue;
            }

            globo.inflar(aire);
            System.out.println("Estado actual del globo: " + globo);
            if (globo.explotado()) {
                turno--;
            }
            turno = (turno == 1) ? 2 : 1;
        }

        if (ganador = turno == 1) {
            System.out.println("¡Ha ganado el jugador 2!");
        }
        if (ganador = turno == 2) {
            System.out.println("¡Ha ganado el jugador 1!");

        }

    }
}
