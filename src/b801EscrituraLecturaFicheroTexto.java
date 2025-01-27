
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class b801EscrituraLecturaFicheroTexto {
    public static void main(String[] args) {
        System.out.println("\nEscritura en datos.txt:");
        PrintWriter  fichero = null;
        try {
             fichero = new PrintWriter(new FileWriter("texto.txt"));
            for (int i = 0; i <= 10; i++) {
                 fichero.println("Linea " + i);
                 fichero.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();  //esto solo pasa si hay un error
        } finally {
            try {
                if ( fichero != null)  fichero.close();   //
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        StringBuilder texto = new StringBuilder();
        BufferedReader ficheroLectura = null;
        try{
             ficheroLectura = new BufferedReader(new FileReader("texto.txt"));
            String linea =  ficheroLectura.readLine();
            while (linea != null) {
                texto.append(linea + "\n");
                linea =  ficheroLectura.readLine();
            }
        } catch(Exception e){
            System.out.println("Error"+e.toString());
        } finally {
            try {
                if ( ficheroLectura != null)  ficheroLectura.close();
            } catch (Exception e) {
                System.out.println("Error" + e.toString());
            }
        }
        System.out.println(texto);
    }
}