package ejNavidadVehiculo;

public class VehiculoPadre {

    private String marca;
    private String modelo;
    private int año;

    public VehiculoPadre(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño() {
        this.año = año;
    }

    //no se por que se pone public y no private
    public void arrancarVehiculo() {
        System.out.println("Vehiculo arrancado.");
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nAño:" + año);
    }
}