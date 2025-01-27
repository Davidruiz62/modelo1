package b305RelojHMbasico;

public class Reloj {
    private int h, m;

    public Reloj() {

        this(8, 15);
        // otra opcion. pero que el de arriba llama a otro constructor sobrecargado
        // h = 8;
        // m = 15;
    }

    public Reloj(int h, int m) {
        this.h = h;
        this.m = m;

        normalizar();
    }

    public Reloj(int totalMinutos) {
        // Pero esto sería mejor, llamar a otro costructor sobrecargado:
        this(0, totalMinutos);
        // otra opcion
        // h = 0;
        // m = totalMinutos;
        // normalizar();
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public String toString() {
        return String.format("%02d:%02d", h, m);
    }

    public boolean equals(Object obj) {
        // Se mira si obj es null. si lo es son distintos
        if (obj == null) return false;

        // Se comprueba si obj es de la clase Reloj. Si NO lo es, consideramos que somos distintos.
        if (!(obj instanceof Reloj)) return false;

        Reloj otro = (Reloj) obj;

        // para terminar se comprueba si son distintos entre si
        return ((this.h == otro.h) && (this.m == otro.m));
    }

    public Reloj clone() {
        Reloj clon = new Reloj();

        clon.h = this.h;
        clon.m = this.m;

        return clon;
        // otra opcion
        // return new Reloj(this.h, this.m);
    }

    private void normalizar() {
        while (m < 0) {
            h--;
            m = m + 60;
        }
        while (m >= 60) {
            h++;
            m = m - 60;
        }

        while (h < 0) {
            h = h + 24;
        }
        while (h >= 24) {
            h = h - 24;
        }
    }

    private int totalMinutos() {
        return 60 * h + m;
    }

    public void tick() {
        sumarMinutos(1);
    }

    public void sumarMinutos(int minutos) {
        m = m + minutos;
        normalizar();
    }

    public void restarMinutos(int minutos) {
        m = m - minutos;
        normalizar();
    }

    public int diferenciaMinutos(Reloj otro) {
        int diferencia = Math.abs(this.totalMinutos() - otro.totalMinutos());
        return diferencia;
    }

    public Reloj diferenciaReloj(Reloj otro) {
        int diferenciaMinutos = this.diferenciaMinutos(otro);

        Reloj diferenciaReloj = new Reloj(diferenciaMinutos);

        return diferenciaReloj;
    }
}