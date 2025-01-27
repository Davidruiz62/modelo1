package b303NumeroInteligenteBasico;

public class principal {
    public static void main(String[] args) {

        System.out.println("Los primeros 20 números naturales, cada uno de ellos, ¿es primo o no?");
        //for (int i               = 1                       ; i            <= 20; i++            );
        for (NumeroInteligente a = new NumeroInteligente(1); a.getValor() <= 20; a.incrementar()) {
            if (a.esPrimo()) {
                System.out.printf("\033[0;1mEl número %d es primo.\033[0;0m\n", a.getValor());
            } else {
                System.out.printf("El número %d no es primo.\n", a.getValor());
            }
        }

        System.out.println("\nLos primeros 20 números primos:");
        NumeroInteligente b = new NumeroInteligente(1);
        int primosConseguidos = 0;
        while (primosConseguidos < 20) {
            // CADA vuelta del while COMPROBARÁ un número, a ver si es primo o no.
            if (b.esPrimo()) {
                System.out.println(b.getValor());
                primosConseguidos++;
            }

            b.incrementar();
        }

        System.out.println("\nNúmeros perfectos:");
        NumeroInteligente d = new NumeroInteligente(1);
        int perfectosConseguidos = 0;
        while (perfectosConseguidos < 5) {
            // CADA vuelta del while COMPROBARÁ un número, a ver si es primo o no.
            if (d.esPerfecto()) {
                System.out.println(d.getValor());
                perfectosConseguidos++;
            }

            d.incrementar();

            if (d.getValor() % 10000 == 0) System.out.printf("Vamos por %d\n", d.getValor());
        }
    }
}
