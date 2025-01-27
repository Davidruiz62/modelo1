package ejNavidadEstudiante;

public class Estudiante {

    private String nombre;
    private int edad;
    private int notaFinal;


    public Estudiante(String nombre, int edad, int notaFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaFinal = notaFinal;
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String aprobadoSuspenso() {
        if (notaFinal < 5) {
            return "El estudiante ha suspendido";
        } else {
            return "El estudiante ha aprobado";
        }
    }

    public String toString() {
        return "Nombre: " + nombre+ " \nEdad: " + edad+ " \nNota Final: " + notaFinal + "\n" + aprobadoSuspenso();
    }
}
