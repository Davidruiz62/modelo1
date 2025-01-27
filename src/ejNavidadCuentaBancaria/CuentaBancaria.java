package ejNavidadCuentaBancaria;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        this.saldo += cantidad;
        System.out.println("Deposito de " + cantidad + " euros.");
    }
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                this.saldo -= cantidad;
                System.out.println("Retirando " + cantidad + " euros.");
            } else {
                System.out.println("No se puede retirar porque no hay suficiente dinero");
            }
        } else {
            System.out.println("La cantidad para retirar tiene que ser mayor que 0.");
        }
    }
}
