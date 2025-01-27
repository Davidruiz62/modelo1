package b310CuentaBancaria;

public class cuentaBancaria {
    private double saldo;
    private double descubiertoMaximo;

    // Constructor para cuentas sin descubierto
    public cuentaBancaria(double saldo) {
        this.saldo = saldo;
        this.descubiertoMaximo = 0;
    }

    // Constructor para cuentas con descubierto máximo
    public cuentaBancaria(double saldo, double descubiertoMaximo) {
        this.saldo = saldo;
        this.descubiertoMaximo = Math.abs(descubiertoMaximo);
    }

    public void ingresarCajero(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a ingresar tiene que ser positiva.");
        } else {
            saldo += cantidad;
        }
    }

    public void extraerCajero(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a extraer tiene que ser positiva.");
        } else if (saldo - cantidad < -descubiertoMaximo) {
            System.out.println("Error: Saldo insuficiente o descubierto máximo superado.");
        } else {
            saldo -= cantidad;
        }
    }

    public void cargarRecibo(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a cargar tiene que ser positiva.");
        } else if (saldo - cantidad < -descubiertoMaximo) {
            System.out.println("Error: Saldo insuficiente o descubierto máximo superado.");
        } else {
            saldo -= cantidad;
        }
    }

    public String toString() {
        return "Saldo: " + saldo +  ". Descubierto máximo permitido:"
                         + (descubiertoMaximo == 0 ?
                                    " No se admite descubierto "
                         : -descubiertoMaximo);
    }

    public cuentaBancaria clone() {
        return new cuentaBancaria(saldo); // creo que se puede poner (saldo, descubiertoMaximo)
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof cuentaBancaria))
            return false;
        cuentaBancaria cuenta = (cuentaBancaria) obj;
        return saldo == cuenta.descubiertoMaximo;
    }
}
