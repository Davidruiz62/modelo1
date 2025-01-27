package b315TresEnRayaOO;

import java.util.Scanner;

public class principalTresEnRayaOO {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        do {
            TableroTresEnRayaOO.dibujar();

            System.out.format("J%d: Introduzca coordenadas:\n", TableroTresEnRayaOO.getJugadorActual());
            System.out.print("Fila: ");
            int fil = teclado.nextInt();
            System.out.print("Columna: ");
            int col = teclado.nextInt();

            TableroTresEnRayaOO.marcar(fil, col);

            TableroTresEnRayaOO.alternarJugador();
        } while (TableroTresEnRayaOO.buscarGanador() == -1);

        TableroTresEnRayaOO.dibujar();

        System.out.println(switch (TableroTresEnRayaOO.buscarGanador()) {
            case 0 -> "Ha quedado en tablas.";
            case 1 -> "Ha ganado el J1.";
            case 2 -> "Ha ganado el J2.";
            default -> "Ouch. Error. Nunca deberíamos llegar aquí :'";
        });
    }
}