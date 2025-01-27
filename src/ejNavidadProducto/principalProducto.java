package ejNavidadProducto;

public class principalProducto {
    public static void main(String[] args) {
        Producto producto = new Producto("Balón de futbol", 18.4, 144);

        System.out.println(producto);

        producto.aplicarDescuento(50);
        System.out.println(producto);
    }
}
