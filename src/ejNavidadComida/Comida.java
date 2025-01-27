package ejNavidadComida;

public class Comida {

    private String nombre;
    private String tipo;
    private double precio;

    public Comida(String nombre, String tipo, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        if (precio >0) {
            this.precio = precio;
        } else {
            System.out.println("El nombre no puede ser negativo");
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularPrecioDescuento(double descuento) {
        if (descuento > 0) {
            return precio - (precio * descuento / 100) ;
        } else {
            System.out.println("El descuento no puede ser negativo");
            return precio;
        }
    }

    public String toString() {
        double descuento = 50;
        double precioDescuento = calcularPrecioDescuento(descuento);
        return "Nombre: " + nombre + " \nTipo: " + tipo + " \nPrecio: " + precio + "\nPrecio con el descuento aplicado: " + precioDescuento;
    }
}
