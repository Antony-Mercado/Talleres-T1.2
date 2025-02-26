package interfacesvsclasesabstractas;
 abstract class Figura {
    public abstract double calcularArea();
}

class Triangulo extends Figura {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }
    
    @Override 
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return base * altura;
    }
}