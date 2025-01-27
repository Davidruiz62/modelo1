package b325Frase;

public class Frase {
    private StringBuilder texto;

    //aqui se inicializa un texto vacio.
    public Frase() {
        this.texto = new StringBuilder();
    }

    //aqui el string seria el valor inicial.
    public Frase(String textoInicial) {
        this.texto = new StringBuilder(textoInicial);
    }

    //aqui si ponen (3,hola), el hola se repite tres veces.
    public Frase(int repeticiones, String cadena) {
        this.texto = new StringBuilder();

        for (int i = 0; i < repeticiones; i++) {
            this.texto.append(cadena);
            if (i < repeticiones - 1) {
                this.texto.append(" ");
            }
        }
    }

    //aqui devuelve el caracter de una posicion que se indica.
    public char caracterEn(int posicion) {
        return texto.charAt(posicion);
    }

    //aqui devuelve la longuitud de la cadena
    public int longitud() {
        return this.texto.length();
    }

    // se añade espacio + cadena al texto
    public void anexar(String cadena) {
        if (this.texto.length() > 0) {
            texto.append(" ");
        }
        texto.append(cadena);
    }


    //aqui se van recortando caracteres desde el final.
    public void recortar(int numCaracteres) {
//        if (numCaracteres >= texto.length()) {
//            texto.setLength(0);
//        } else {
//            texto.setLength(texto.length() - numCaracteres);
//        }
//        if (texto.length() > 0 && texto.charAt(texto.length() -1) == ' ') {
//            texto.delete(texto.length() -1, texto.length());
//        }
        texto.setLength(texto.length() - numCaracteres);
//        texto.delete(texto.length() - numCaracteres); // tambien sirve para cortar en el medio

    }


    public String obtenerTexto() {
        return this.texto.toString();
    }

    public boolean equals(Object objeto) {
        if (objeto == null) return false;
        if (!(objeto instanceof Frase)) return false;
        Frase otra = (Frase) objeto;
        return this.texto.toString().equals(objeto.toString());
    }

    public Frase clone() {
        return new Frase(texto.toString());
    }
}
