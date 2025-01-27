package b320GlobosExplosivosParte3;

import java.util.Scanner;

public class PrincipalGlobosExplosivosParte3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rondasGanadasTurno1 = 0;
        int rondasGanadasTurno2 = 0;
        int rondasTotales = 5;

        System.out.println("Bienvenido al juego del Globo Explosivo, se juega a 5 rondas, si algún jugador gana 3 partidas el juego ha finalizado.");


        for (int rondas = 1; rondas <= rondasTotales; rondas++) {
            System.out.println("---------------------------------- Ronda " + rondas + " ----------------------------------");
            GlobosExplosivosParte3 globo = new GlobosExplosivosParte3();
            int turno = 1;

            while (!globo.explotado()) {
                System.out.print("Jugador " + turno + " ¿Cuánto aire quieres introducir?: ");
                int aire = scanner.nextInt();

                if (aire <= 0) {
                    System.out.println("No se puede introducir una cantidad negativa de aire.");
                    continue;
                }
                globo.inflar(aire);
                System.out.println("Estado actual del globo: " + globo);
                if (globo.explotado()) {
                    //turno--;
                    System.out.println("¡El globo ha explotado!");
                    if (turno == 1) {
                        rondasGanadasTurno2++;
                        System.out.println("¡El jugador 2 ha ganado esta ronda!");
                    } else {
                        rondasGanadasTurno1++;
                        System.out.println("¡El jugador 1 ha ganado esta ronda!");
                    }
                    break;
                }

                turno = (turno == 1) ? 2 : 1;
            }
            System.out.println("Puntuación actual");
            System.out.println("Jugador 1: " + rondasGanadasTurno1 + " rondas ganadas");
            System.out.println("Jugador 2: " + rondasGanadasTurno2 + " rondas ganadas");

            if (rondasGanadasTurno1 == 3 || rondasGanadasTurno2 == 3) {
                break;
            }
        }
        if (rondasGanadasTurno1 < rondasGanadasTurno2) {
            System.out.println("¡El jugador 2 ha ganado el juego!");
        } else {
            System.out.println("¡El jugador 1 ha ganado el juego!");
        }
    }
}