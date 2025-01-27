package ejNavidadCoche;

public class principalCoche {
    public static void main(String[] args) {

        Coche coche = new Coche("Audi", "r8", 2025);

        System.out.println("Datos del coche");
        System.out.println("La marca del coche es: " + coche.getMarca());
        System.out.println("El modelo del coche es: " + coche.getModelo());
        System.out.println("El año del coche es: " + coche.getAño());


        // no se como ponerlo para que se pueda cambiar la informacion del coche.

    }
}
