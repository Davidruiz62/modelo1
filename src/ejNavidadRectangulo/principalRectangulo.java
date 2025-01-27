package ejNavidadRectangulo;

public class principalRectangulo {
    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(8,9);

        System.out.println("Datos del rectangulo: ");
        System.out.println("El largo del rectangulo es: " + rectangulo.getLargo());
        System.out.println("El ancho del rectangulo es: " + rectangulo.getAncho());
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
        System.out.println("El area del rectangulo es: " + rectangulo.calcularPerimetro());
    }
}
