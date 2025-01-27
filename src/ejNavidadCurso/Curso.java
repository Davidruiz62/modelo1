package ejNavidadCurso;

public class Curso {

    private String nombreCurso;
    private int codigoCurso;
    private String profesorCurso;
    private int estudiantesCurso;

    public Curso(String nombreCurso, int codigoCurso, String profesorCurso) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.profesorCurso = profesorCurso;
        this.estudiantesCurso = 0;
    }
    public String getNombreCurso() {
        return nombreCurso;
    }
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public int getCodigoCurso() {
        return codigoCurso;
    }
    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
    public String getProfesorCurso() {
        return profesorCurso;
    }
    public void setProfesorCurso(String profesorCurso) {
        this.profesorCurso = profesorCurso;
    }
    public int getEstudiantesCurso() {
        return estudiantesCurso;
    }

    //con este se incrementa el contador de estudiantes que estan inscritos
    public void apuntarEstudiantesCurso() {
        estudiantesCurso++;
    }

    //com este devuelve la cantidad de estudiantes que hay calculada arriba
    public int calcularCantidadEstudiantesCurso() {
        return estudiantesCurso;
    }

    //si se inscriben de 1 en 1 seria solo hasta aqui.
    //pero si se escriben 28 de golpe seria añadiendo esto.

    public void aumentarEstudiantesCurso(int cantidad) {
        if (cantidad > 0) {
            estudiantesCurso += cantidad;
        } else {
            System.out.println("La cantidad de alumnos que desea inscribir tiene que ser mayor que 0.");
        }
    }
}
