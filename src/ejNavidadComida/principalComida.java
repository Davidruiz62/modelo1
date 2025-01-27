package ejNavidadComida;

public class principalComida {
    public static void main(String[] args) {
        Comida comida = new Comida("Hamburguesa", "Pollo", 10);

        System.out.println(comida);

        comida.calcularPrecioDescuento(50);
        System.out.println(comida);

    }
}
