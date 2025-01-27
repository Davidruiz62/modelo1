package pruebasNavidad;

import java.util.Scanner;
public class principalNavidad {
    public static void main(String[] args) {
        int[] lista = {1, 1, 2, 2, 4, 4, 3, 3, 7, 8, 9, 10};
        int[] compararLista = new int[lista.length];
        int contador = 0;

        for (int i = 0; i < lista.length; i++) {
            boolean estaDuplicado = false;
            for (int j = 0; j < contador; j++) {
                if (lista[i] == compararLista[j]) {
                    estaDuplicado = true;
                }
            }
            if (!estaDuplicado) {
                compararLista[contador++] = lista[i];
            }
        }
        int[] nuevoArray = new int[contador];
        for (int i = 0; i < contador; i++) {
            nuevoArray[i] = compararLista[i];
            System.out.println(nuevoArray[i]);
        }
    }
}
