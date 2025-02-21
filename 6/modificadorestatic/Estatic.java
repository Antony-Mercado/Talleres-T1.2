package modificadorestatic;

public class Estatic {

public class EjemploIncorrecto {

    private int numero = 10;

    public void mostrarNumero() {
        System.out.println("Número: " + numero); 
    }

    public void main(String[] args) {
        mostrarNumero();
    }
}
}