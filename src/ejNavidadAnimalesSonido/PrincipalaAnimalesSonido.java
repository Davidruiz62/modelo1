package ejNavidadAnimalesSonido;

public class PrincipalaAnimalesSonido {
    public static void main(String[] args) {

        AnimalSonido Perro = new Perro();
        AnimalSonido Gato = new Gato();

        System.out.println(Perro.hacerSonido());
        System.out.println(Gato.hacerSonido());
    }
}
