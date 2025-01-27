package ejNavidadCurso;

public class principalCurso {

    public static void main(String[] args) {

     Curso curso = new Curso("Tercero A", 21, "David");

     System.out.println("Estudiantes: " + curso.getEstudiantesCurso());

     curso.apuntarEstudiantesCurso();
     curso.aumentarEstudiantesCurso(27);

     System.out.println("Estudiantes: " + curso.getEstudiantesCurso());
     //en este no se por que no llama a apuntarEstudianteCurso y hay que llamar a getEstudianteCurso
    }
}
