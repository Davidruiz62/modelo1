package ejNavidadPersona;

public class principalPersona {
    public static void main(String[] args) {

        Persona persona = new Persona("David Ruiz", 21, "Una calle perdidia de Parla.");
        System.out.println("Datos de la Persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Direccion: " + persona.getDireccion());

        // no se como ponerlo para que pueda cambiar la informacion de la persona.

    }
}
