package b310CuentaBancaria;

public class principal {
    public static void main(String[] args) {
        // aqui se crea una cuenta sin descubierto
        cuentaBancaria cuenta1 = new cuentaBancaria(100);

        // aqui se crea una cuenta con descubierto máximo de 70
        cuentaBancaria cuenta2 = new cuentaBancaria(100, 70);

        System.out.println("Cuenta 1: " + cuenta1);
        System.out.println("Cuenta 2: " + cuenta2);

        cuenta1.ingresarCajero(200);
        System.out.println("Cuenta 1 después de ingresar dinero: " + cuenta1);

        cuenta2.extraerCajero(1200);

        cuenta2.cargarRecibo(1070);  //aqui se puede generar un error si se pasa el limite del descubierto

        // aqui se comparan dos cuentas
        System.out.println("Cuenta 1 es igual a Cuenta 2? " + cuenta1.equals(cuenta2));

        // Clonar una cuenta
        cuentaBancaria cuentaClonada = cuenta1;
        System.out.println("Cuenta clonada: " + cuentaClonada);
    }
}
