package B302ContadorConstructorYResetearEqualsClone;

public class principal {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        // es un parametro que se pasa al metodo
        Contador c2 = new Contador(89);
        System.out.printf("Contador: %3d y %3d\n", c1.getValor(), c2.getValor());
        c1.setValor(77);
        System.out.printf("Contador: %3d y %3d\n", c1.getValor(), c2.getValor());
        c1.incrementar();
        c2.incrementar(4);
        System.out.printf("Contador: %3d y %3d\n", c1.getValor(), c2.getValor());
        c1.incrementar(300);
        System.out.printf("Contador: %3d y %3d\n", c1.getValor(), c2.getValor());
        c1.decrementar();
        System.out.printf("Contador: %3d y %3d\n", c1.getValor(), c2.getValor());
        c2.decrementar();
        System.out.printf("Contador: %3d y %3d\n", c1.getValor(), c2.getValor());
        //System.out.printf("Contador: %s y %s", c1, c2); para el de patata
        System.out.printf("Contador: %s y %s\n", c1, c2);

        Contador a = new Contador(5);
        Contador b = new Contador(5);
        Contador d = a;

        System.out.println("A: " +a);
        System.out.println("B: "+b);

        if (a.equals(b)) {
            System.out.println("A y B son iguales");
        } else {
            System.out.println("A y B son distintos");
        }

        Contador c = (Contador) a.clone();

        c.incrementar(10);

        System.out.println("C: " +c);
        System.out.println("D: " +d);

    }
}
