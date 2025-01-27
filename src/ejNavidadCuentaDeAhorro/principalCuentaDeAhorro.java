package ejNavidadCuentaDeAhorro;

public class principalCuentaDeAhorro {
    public static void main(String[] args) {

        CuentaDeAhorrosHijo cuentaDeAhorro = new CuentaDeAhorrosHijo(100, 25);

        System.out.println("Saldo inicial: " + cuentaDeAhorro.obtenerSaldo());

        cuentaDeAhorro.aplicarInteresesAnuales();

        System.out.println("Después de aplicar intereses: " + cuentaDeAhorro.obtenerSaldo());
    }
}
