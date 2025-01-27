package b303NumeroInteligenteBasico;

public class NumeroInteligente {
    private int valor;

    public NumeroInteligente() {
        setValor(0);
    }

    public NumeroInteligente(int valor) {
        setValor(valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void incrementar() {
        incrementar(1);
    }

    public void incrementar(int cantidad) {
        setValor(valor + cantidad);
    }

    public void decrementar() {
        decrementar(1);
    }

    public void decrementar(int cantidad) {
        setValor(valor - cantidad);
    }

    private boolean esDivisible(int dividendo, int divisor) {
        return (dividendo % divisor == 0);
    }

    public boolean esPrimo() {
        if (valor <= 1) return false;

        for (int divisor = 2; divisor < valor; divisor++) {
            if (esDivisible(valor, divisor)) {
                return false;
            }
        }
        return true;
    }

    public boolean esPerfecto() {
        if (valor < 2) return false;

        int sumaDeLosDivisores = 0;

        for (int divisor=1; divisor<valor; divisor++) {
            if (esDivisible(valor, divisor)) {
                sumaDeLosDivisores = sumaDeLosDivisores + divisor;
            }
        }

        return (sumaDeLosDivisores == valor);
    }
}

