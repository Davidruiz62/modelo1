package b306RelojCompletoEqualsClone;

import b305RelojHMbasico.Reloj;

public class principal {
    public static void main(String[] args) {
        Reloj reloj1 = new Reloj();
        Reloj reloj2 = new Reloj(150);
        Reloj reloj3 = new Reloj(3, 45);

        System.out.println(reloj1);
        System.out.println(reloj2);
        System.out.println(reloj3);

        reloj1.tick();

        reloj1.sumarMinutos(3498745);

        System.out.println("Tras tick y sumar unos pocos minutos: " + reloj1);

        reloj1.restarMinutos(205432340);

        System.out.println("Restado muchos minutos: " + reloj1);

        //Reloj reloj4 = reloj3.clone();
        //reloj4.sumarMinutos(3);

        //System.out.println(reloj4);
    }
}
