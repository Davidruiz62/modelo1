package ejNavidadVehiculo;

public class MotoHijo extends VehiculoPadre {

    public MotoHijo(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    public void arrancar() {
        System.out.println("La moto está arrancada.");
    }

    public void realizarStunt() {
        System.out.println("La moto está realizando un stunt.");
    }
}





