package b312CuentaBancariaConInt;

public class CuentaBancariaConInt {

    private int saldo;
    private int descubiertoMaximo;

    // Constructor para cuentas sin descubierto
    public CuentaBancariaConInt(double saldoInicial) {
        this.saldo = pasarACentimos(saldoInicial);
        this.descubiertoMaximo = 0;
    }

    // Constructor para cuentas con descubierto máximo
    public CuentaBancariaConInt(double saldoInicial, double descubiertoMaximo) {
        this.saldo = pasarACentimos(saldoInicial);
        this.descubiertoMaximo = Math.abs(pasarACentimos(descubiertoMaximo));
    }

    public void ingresarCajero(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a ingresar tiene que ser positiva.");
        } else {
            saldo += pasarACentimos(cantidad);
        }
    }

    public void extraerCajero(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a extraer tiene que ser positiva.");
        } else if (saldo - pasarACentimos(cantidad) < -descubiertoMaximo) {
            System.out.println("Error: No se puede extraer dinero porque el saldo es insuficiente o el descubierto máximo se ha superado.");
        } else {
            saldo -= pasarACentimos(cantidad);
        }
    }

    public void cargarRecibo(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a cargar tiene que ser positiva.");
        } else if (saldo - pasarACentimos(cantidad) < -descubiertoMaximo) {
            System.out.println("Error: No se puede cargar recibo porque el saldo es insuficiente o el descubierto máximo se ha superado.");
        } else {
            saldo -= pasarACentimos(cantidad);
        }
    }

    public String toString() {
        return "Saldo: " + convertirDouble(saldo) +  ". Descubierto máximo permitido:"
                + (descubiertoMaximo == 0 ?
                " No se admite descubierto "
                : convertirDouble (-descubiertoMaximo)) ;
    }

    public CuentaBancariaConInt clone() {
        return new CuentaBancariaConInt(convertirDouble(saldo), convertirDouble(descubiertoMaximo));
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof CuentaBancariaConInt))
            return false;
        CuentaBancariaConInt cuenta = (CuentaBancariaConInt) obj;
        //return this.saldo == cuenta.saldo && this.descubiertoMaximo == cuenta.descubiertoMaximo;
        return saldo == cuenta.descubiertoMaximo;
    }


    private int pasarACentimos(double cantidad) {
        return (int) Math.round(cantidad * 100);
    }

    private double convertirDouble(int cantidadCentimos) {
        return cantidadCentimos / 100.0;
    }
}















