package ejNavidadEmpleadoSalario;

public class EmpleadoHijo extends PersonaPadre {
    private double salario;

    public EmpleadoHijo(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String informacionEmpleado() {
        return "Nombre: " + getNombre() + " \nEdad: " + getEdad() + " \nSalario: " + getSalario();

        //he visto en el chat algo como que ponen super.informacionPersona(); y debajo ya lo de salario y eso.
        // creo que lo de super es para no volver a escribir. otra vez tod o.
    }
}
