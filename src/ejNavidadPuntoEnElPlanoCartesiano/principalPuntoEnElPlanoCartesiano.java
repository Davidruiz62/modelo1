package ejNavidadPuntoEnElPlanoCartesiano;

public class principalPuntoEnElPlanoCartesiano {

    public static void main(String[] args) {

        PuntoEnElPlanoCartesiano punto1 = new PuntoEnElPlanoCartesiano(5,5);
        PuntoEnElPlanoCartesiano punto2 = new PuntoEnElPlanoCartesiano(10,10);

        System.out.println("Punto 1:");
        punto1.mostrarCoordenadas();
        System.out.println("Punto 2:");
        punto2.mostrarCoordenadas();

        double distancia = punto1.calcularDistancia(punto2);
        System.out.println("Distancia entre punto 1 y punto 2: " + distancia);


    }
}
