package herenciasimple;
 public class Vehiculo {
    protected String marca;
    protected double velocidadMaxima;

    public Vehiculo(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}

// Clase derivada Coche
class Coche extends Vehiculo {
    private int numeroDePuertas;

    // Constructor
    public Coche(String marca, double velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima); 
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de Puertas: " + numeroDePuertas);
    }
}

 class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Toyota", 180);
        System.out.println("Detalles del Vehículo:");
        vehiculo1.mostrarInfo();

        Coche coche1 = new Coche("ferrari", 220, 4);
        System.out.println("Detalles del Coche:");
        coche1.mostrarInfo();
    }
}