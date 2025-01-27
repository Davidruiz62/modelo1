package ejNavidadCuentaBancaria;

public class principalCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria(100);

        System.out.println("Datos de la cuenta:");
        System.out.println("El saldo inicial es de: " + cuentaBancaria.obtenerSaldo() + " euros.");
        cuentaBancaria.depositar(50);
        System.out.println("Despues de depositar: " + cuentaBancaria.obtenerSaldo() + " euros.");
        cuentaBancaria.retirar(300);
        System.out.println("Despues de retirar: " + cuentaBancaria.obtenerSaldo() + " euros.");

    }
}
