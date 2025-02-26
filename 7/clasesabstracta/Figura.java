package clasesabstracta;
public abstract class Figura {
    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.println("El área es: " + calcularArea());
  }
}
class Circulo extends Figura {
    private double radio;
public Circulo(double radio) {
        this.radio = radio;
}
    @Override
    public double calcularArea() {
     return Math.PI * radio * radio;
 }
}
class Rectangulo extends Figura {
    private double base, altura;
 public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
}
    @Override
    public double calcularArea() {
        return base * altura;
 }
}
 class Main {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(4, 6);  
        rectangulo.mostrarArea();  
        Figura circulo = new Circulo(3);  
        circulo.mostrarArea();  
 }
}