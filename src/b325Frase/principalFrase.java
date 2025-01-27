package b325Frase;

public class principalFrase {
    public static void main(String[] args) {

        Frase frase1 = new Frase("Hola caracola");
        System.out.println("Texto inicial: " + frase1.obtenerTexto());

        Frase frase2 = new Frase(3, "hola");
        System.out.println("Texto inicial con repeticiones: " + frase2.obtenerTexto());

        System.out.println("Carácter en posición 3: " + frase2.caracterEn(2));

        System.out.println("Longitud de la frase: " + frase2.longitud());

        frase1.anexar("siiiiuuuuuuu");
        System.out.println("Texto tras anexar: " + frase1.obtenerTexto());

        frase1.recortar(9);
        System.out.println("Texto tras recortar: " + frase1.obtenerTexto());
    }
}