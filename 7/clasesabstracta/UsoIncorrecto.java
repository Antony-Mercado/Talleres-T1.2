package clasesabstracta;
abstract class Figura {
    protected String tipo;

    public Figura(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarTipo() {
        System.out.println("Tipo de figura: " + tipo);
    }
    public abstract void calcularArea();
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("Área del " + tipo + ": " + area);
    }
}

 class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        c.mostrarTipo();  
        c.calcularArea(); 
    }
}