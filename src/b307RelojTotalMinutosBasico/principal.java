package b307RelojTotalMinutosBasico;

import b305RelojHMbasico.Reloj;

public class principal {
    public static void main(String[] args) {

        Reloj reloj2 = new Reloj(150);
        Reloj reloj3 = new Reloj(3,45);


        System.out.println(reloj2);
        System.out.println(reloj3);

        reloj2.tick();

        reloj2.sumarMinutos(34432);

        System.out.println("Tras tick y sumar unos pocos minutos: " + reloj2);

        reloj2.restarMinutos(-6);

        System.out.println("Restado muchos minutos: " + reloj2);
    }
}
