package interfacesvsclasesabstractas;

public class InterfacesvsClasesAbstractas {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(2,7);
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
        
        Figura triangulo = new Triangulo(7,10);
        System.out.println("Area del triangulo: " + triangulo.calcularArea());    }
    
}