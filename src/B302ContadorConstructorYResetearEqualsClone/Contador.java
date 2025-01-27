package B302ContadorConstructorYResetearEqualsClone;

public class Contador {
    public static final int POR_DEFECTO = 1;
    public static final int MAX =100;
    public static final int MIN = 0;
    public static final int PASO = 20;

    private int valor;

    public Contador() {
        resetear();
    }

    public Contador(int valor) {
        setValor(valor);
    }

    public int getValor() {
        return valor;
    }                                                   //(int valor)

    //this.valor =valor; // este toma un valor y lo asigna algo, y lo de la izquierda es como asignarlo a algo para saber que es
    //(int valor) es lo mismo que = valor       // this. va relacionado con lo de arriba de private int valor.
    public void setValor(int valor) {
        if (valor < MIN)      this.valor = MIN;
        else if (valor > MAX) this.valor = MAX;
        else                this.valor = valor;
    }

    public void resetear() {
        setValor(POR_DEFECTO);
    }

    public void incrementar() {
        incrementar(PASO);
    }

    public void incrementar(int cantidad) {
        setValor(valor + cantidad);
        //    if (valor+cantidad <= MAX){
        //        valor = valor + cantidad;
        //    } else {
        //        valor = MIN;
        //    }
        // creo que esto hace o mismo que la linea esa
    }

    public void decrementar() {
        decrementar(PASO);
    }

    public void decrementar(int cantidad) {
        setValor(valor - cantidad);
    }

    public String toString() {
        //return "patata";
        return String.format("vale %d", valor);
    }


    public boolean equals(Object obj) {
            // Se comprueba si obj es null. Si lo es, consideramos que somos distintos.
        if (obj==null) return false;
            // Se comprueba si obj es de la clase Reloj. Si NO lo es, consideramos que somos distintos.
        if (!(obj instanceof Contador)) return false;
            // Si el programa llega hasta este punto, sabemos que obj no es null y que es de la clase Reloj.
            // Declaramos una variable nueva de tipo reloj. Esta variable apuntará al mismo
            // objeto que la variable obj, pero en este caso miraremos al objeto tratándolo
            // como uno de la clase Reloj, en lugar de uno de la clase Object.
        Contador otro = (Contador) obj;
        return this.valor == otro.valor;
    }

    //public Contador clone() {
    //    Contador clon  = new Contador();
    //    clon.valor = this.valor;
    //    return clon;
    //}            se puede poner de las dos formas
    public Contador clone() {
        return new Contador(valor);
    }
}
