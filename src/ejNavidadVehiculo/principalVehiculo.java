package ejNavidadVehiculo;

public class principalVehiculo {
    public static void main(String[] args) {

        VehiculoPadre vehiculoPadre = new VehiculoPadre("Peugeot", "208", 2008);

        vehiculoPadre.mostrarInformacion();
        //System.out.println(vehiculoPadre.mostrarInformacion());
        //no entiendo porque no pongo lo de System.... y si funciona lo de vehiculopadre para que se muestre informacion de arriba.

        vehiculoPadre.arrancarVehiculo();
        //igual que con lo de arracncar

        MotoHijo moto = new MotoHijo("Honda.", "CB500F", 2017);
        moto.mostrarInformacion();
        moto.arrancar();
        //igual con esto. No se por que no se pone lo de System...
    }
}
