package ejNavidadCuentaDeAhorro;

public class CuentaDeAhorrosHijo extends CuentaBancariaPadreEnCuentaAhorros {

    private double intereses;

    public CuentaDeAhorrosHijo(double SaldoInicial, double intereses) {
        super(SaldoInicial); //esto no lo entiendo mucho.
        this.intereses = intereses;
    }
    public double getIntereses() {
        return intereses;
    }
    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }
    public double calcularIntereses() {
        return obtenerSaldo() * (intereses / 100);
    }
    public void aplicarInteresesAnuales() {
        double interesesAnuales = calcularIntereses();
        depositar(interesesAnuales);
        System.out.println(interesesAnuales);
    }
}