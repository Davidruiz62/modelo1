package ejNavidadPuntoEnElPlanoCartesiano;

public class PuntoEnElPlanoCartesiano {

    private double x;
    private double y;

    public PuntoEnElPlanoCartesiano(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    //no se por que aqui solo se ponen los get y no los set

    public double calcularDistancia(PuntoEnElPlanoCartesiano otroPuntoEnElPlanoCartesiano) {
        double PuntoX = otroPuntoEnElPlanoCartesiano.getX() - this.x;
        double PuntoY = otroPuntoEnElPlanoCartesiano.getY() - this.y;
        return Math.sqrt(PuntoX * PuntoX + PuntoY * PuntoY);
    }

    public void mostrarCoordenadas() {
        System.out.println("Coordenadas \nX: " + this.x + "\nY: " + this.y);
    }
}
