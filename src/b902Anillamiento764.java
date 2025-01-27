
import java.util.Scanner;
public class b902Anillamiento764 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capturasCampañasActual = sc.nextInt();

        while (capturasCampañasActual > 0) {
            int totalAvesAnilladas = 0;

            for (int captura = 0; captura < capturasCampañasActual; captura++) {
                int avesCapturadas = sc.nextInt();
                int avesConAnillas = sc.nextInt();
                totalAvesAnilladas += (avesCapturadas - avesConAnillas);
            }
            System.out.println(totalAvesAnilladas);
            capturasCampañasActual = sc.nextInt();
        }
    }
}