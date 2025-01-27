package recuperacion;

import java.util.Random;
public class Main {
    private static final int FILAS = 3;
    private static final int COLUMNAS = 3;

    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[FILAS][COLUMNAS];

        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLUMNAS; col++) {
                matriz[fil][col] = random.nextInt(100) + 1;
            }
        }
        System.out.println("Matriz:");
        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLUMNAS; col++) {
                System.out.print(matriz[fil][col] + "\t");
            }

            System.out.println();
        }
        int sumaTotal = 0;
        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLUMNAS; col++) {
                sumaTotal = sumaTotal + matriz[fil][col];
            }
        }
        System.out.println("\nLa suma total de los valores de la matriz: " + sumaTotal);
    }
}