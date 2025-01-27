package ejNavidadEmpleadoSalario;

public class principalEmpleadoSalario {
    public static void main(String[] args) {
        EmpleadoHijo empleado = new EmpleadoHijo("David", 21, 222);

// este funcionaria si el metodo fuera estatico.
// System.out.println(EmpleadoHijo.informacionEmpleado());
        System.out.println(empleado.informacionEmpleado());
        // la linea de arriba funciona porque el metodo que se utiliza no es estatico

        // preguntar tambien.
    }
}
