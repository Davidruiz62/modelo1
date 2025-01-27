package b331BingoSoloBombo;

import java.util.Random;


public class Carton {

    private int[] numeros;
    private boolean[] marcas;
    private Bombo bombo;

    public Carton(int cantidadNumeros, Bombo bombo) {
        this.numeros = new int[cantidadNumeros];
        this.marcas = new boolean[cantidadNumeros];
        this.bombo = bombo;

        rellenarAleatoriamente();
    }

    // aqui se ponen los numeros aleatorios en el carton y no se pueden repetir
    private void rellenarAleatoriamente() {
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            int numero;
            do {
                numero = random.nextInt(bombo.cantidadBolas) + 1;
            } while (estaEnCarton(numero));
            numeros[i] = numero;
        }
    }

    private boolean estaEnCarton(int numero) {
        for (int num : numeros) {
            if (num == numero) {
                return true;
            }
        }
        return false;
    }

    public void anotaBola(int bola) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == bola) {
                marcas[i] = true;
                break;
            }
        }
    }

    public boolean hayBingo() {
        for (boolean marca : marcas) {
            if (!marca) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String resultado = "Carton actualizado: ";
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i] + " ";
            if (marcas[i]) {
                resultado += ("(*)");
            }
            resultado += " ";
        }
        return resultado;
    }
}
