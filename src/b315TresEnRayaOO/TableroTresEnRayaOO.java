package b315TresEnRayaOO;

public class TableroTresEnRayaOO {
    private static int[][] matriz = new int[3][3];
    private static int jugadorActual = 1;

    public static void dibujar() {
        System.out.println("Tablero");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char simbolo = switch (matriz[i][j]) {
                    case 1 -> 'X';
                    case 2 -> 'O';
                    default -> ' ';
                };
                System.out.print(" " + simbolo + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("---+---+---");
        }
    }

    //estaba static void y habia que poner static boolean
    public static boolean marcar(int fil, int col) {
        if (fil < 0 || fil >= 3 || col < 0 || col >= 3 || matriz[fil][col] != 0) {
            return false; // Posición inválida porque está fuera del tablero
        }
        matriz[fil][col] = jugadorActual;
        return true;
    }

    public static int getJugadorActual() {
        return jugadorActual;
    }

    public static void alternarJugador() {
        jugadorActual = (jugadorActual == 1) ? 2 : 1;
    }

    public static int buscarGanador() {
        // se mira si en las columnas hay victoria de un jugador
        for (int i = 0; i < 3; i++) {
            if (matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2] && matriz[i][0] != 0) {
                return matriz[i][0]; // dice el jugador que ganó
            }
        }

        // se mira si en las columnas hay victoria de un jugador
        for (int j = 0; j < 3; j++) {
            if (matriz[0][j] == matriz[1][j] && matriz[1][j] == matriz[2][j] && matriz[0][j] != 0) {
                return matriz[0][j]; // dice el jugador que ganó
            }
        }

        // Se mira si en las diagonales hay victoria de un jugador
        if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2] && matriz[0][0] != 0) {
            return matriz[0][0]; // dice el jugador que ganó
        }
        if (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0] && matriz[0][2] != 0) {
            return matriz[0][2]; // dice el jugador que ganó
        }

        // Si no hay ganador, el juego continúa
        return -1;
    }
}
