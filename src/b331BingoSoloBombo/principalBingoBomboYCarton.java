package b331BingoSoloBombo;

public class principalBingoBomboYCarton {
    public static void main(String[] args) {
        Bombo bombo = new Bombo(80);
        Carton carton = new Carton(10, bombo);
        System.out.println("Estado inicial del bombo");
        System.out.println(bombo);

        System.out.println("Estado inicial del carton");
        System.out.println(carton);

        System.out.println("\n¡Vamos a sacar bolas!");
        while (!carton.hayBingo()) {
            int bola = bombo.dameBola();
            System.out.println("\nAcaba de salir la bola: " + bola);
            carton.anotaBola(bola);
            System.out.println(carton);
        }
        System.out.println("\n¡BINGO!");
    }
}
