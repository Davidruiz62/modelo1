import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class b802AnillamientoConFicheros {
    public static void main(String[] args) {
        BufferedReader ficheroLectura = null;
        PrintWriter ficheroEscritura = null;
        try {
            // aqui como que se llen los datos del archivo
            ficheroLectura = new BufferedReader(new FileReader("entrada.txt"));
            ficheroEscritura = new PrintWriter(new FileWriter("salida.txt"));

            String linea = ficheroLectura.readLine();
            int totalTotalAvesAnilladas = 0;

            while (linea != null) {
                int totalAvesAnilladas = 0;
                System.out.println("Captura: " + linea);

                int n = Integer.parseInt(linea.trim());
                if (n == 0) break;
                for (int i = 0; i < n; i++) {
                    linea = ficheroLectura.readLine();
                    System.out.println("Aves: " + linea);

                    String[] valores = linea.split(" ");
                    int capturadas = Integer.parseInt(valores[0]);
                    int conAnillo = Integer.parseInt(valores[1]);

                    totalAvesAnilladas += (capturadas - conAnillo);

                }
                totalTotalAvesAnilladas += totalAvesAnilladas;

                System.out.println("Total aves anilladas: " + totalAvesAnilladas);
                ficheroEscritura.println(totalAvesAnilladas);

                linea = ficheroLectura.readLine();
                System.out.println();
            }
            System.out.println("Total de anillas gastadas : " + totalTotalAvesAnilladas);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ficheroLectura != null) ficheroLectura.close();
                if (ficheroEscritura != null) ficheroEscritura.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
