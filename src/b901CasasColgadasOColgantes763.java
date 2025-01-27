import java.util.Scanner;

public class b901CasasColgadasOColgantes763 {
    public static void main(String[] args) {

        Scanner entrada  = new Scanner(System.in);

        int cantidad = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < cantidad; i++) {
            String palabra = entrada.nextLine();
            palabra = palabra.toLowerCase();

            if (palabra.equals("colgadas")) {
                System.out.println("Bien");
            } else {
                System.out.println("Mal");
            }
        }
    }
}
