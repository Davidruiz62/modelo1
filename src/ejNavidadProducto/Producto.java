package ejNavidadProducto;

public class Producto {

    private String nombre;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo");
        }
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }
    public void setCantidadEnStock(int cantidadEnStock) {
        if (cantidadEnStock > 0) {
            this.cantidadEnStock = cantidadEnStock;
        } else {
            System.out.println("El cantidad de stock no puede ser negativo");
        }
    }

    public void aplicarDescuento(double descuento) {
        if (descuento > 0) {
            double descuentoPrecio = (descuento * precio) / 100;
            precio = precio - descuentoPrecio;
        } else {
            System.out.println("El descuento no puede ser negativo");
        }
    }

    public String toString() {
        return  "\nNombre: " + nombre + "\nPrecio: " + precio + "\nCantidad de stock: " + cantidadEnStock;
    }
}
