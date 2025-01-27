package ejNavidadRectangulo;

public class Rectangulo {

    private int largo;
    private int ancho;

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    public int getLargo() {
        return largo;
    }
    public void setLargo(int largo) {
        this.largo = largo;
    }
    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public int calcularArea() {
        return largo * ancho;
    }
    public int calcularPerimetro() {
        return 2 * (largo + ancho);
    }
}
