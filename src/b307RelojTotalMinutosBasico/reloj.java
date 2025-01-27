package b307RelojTotalMinutosBasico;

public class reloj {
    private int totalMinutos;

    // aqui tenia las 8:15

    public reloj() {
        totalMinutos = 8*60+15;
        //cre que tambien podria ser
        // this(8,15);
    }

    public reloj(int h, int m) {
        this.totalMinutos = 60*h+m;
    }

    public reloj (int totalMinutos) {
        this.totalMinutos = totalMinutos;
    }

    //public boolean equals(Object obj) {
    //    if (obj == null) return false;

     //   if (!(obj instanceof reloj) {}
    //}

    public reloj clone() {
        return new reloj(totalMinutos);
    }

    public int getMinutos() {
        return totalMinutos;
    }

    public void tick() {
        sumarMinutos(1);
    }

    public void sumarMinutos(int minutos) {
        this.totalMinutos += minutos;
    }


    public void restarMinutos(int minutos) {
        this.totalMinutos = totalMinutos - minutos;
    }

    public int diferenciaMinutos(reloj otro) {
        return otro.getMinutos() - this.totalMinutos;
    }


    //public int

    //public String toString() {
    //    return String.format("%02d:%02d", h, m);
    //}
}
