package b306RelojCompletoEqualsClone;
public class reloj {

    private int h;
    private int m;

    public reloj() {
        h = 8;
        m = 15;
    }

    public reloj(int h, int m) {
        this.h = h % 24;
        this.m = m % 60;
    }

    public reloj(int totalMinutos) {
        this.h = (totalMinutos / 60) % 24;
        this.m = totalMinutos % 60;
    }

    public void tick() {
        m++;
        if (m == 60) {
            m = 0;
            h++;
            if (h == 24) {
                h = 0;
            }
        }
    }

    public void sumarMinutos(int minutos) {
        int totalMinutos = h * 60 + m + minutos;
        this.h = (totalMinutos / 60) % 24;
        this.m = totalMinutos % 60;
    }

    public void restarMinutos(int minutos) {
        int totalMinutos = h * 60 + m - minutos;
        if (totalMinutos < 0) {
            totalMinutos += 1440;
        }
        this.h = (totalMinutos / 60) % 24;
        this.m = totalMinutos % 60;
    }

    public String toString() {
        return String.format("%02d:%02d", h, m);
    }

    public reloj clone() {
        reloj clon = new reloj();
        clon.h = this.h;
        clon.m = this.m;
        return clon;
    }
}