package modificadorestatic;
public class Coche {
 private String marca;
 private String modelo;

    private static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++; 
    }
    public static void mostrarTotalCoches() {
        System.out.println("Total de coches creados: " + contadorCoches);
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }

    public static void main(String[] args) {
        Coche co1 = new Coche("Ferrari", "Corolla");
        Coche co2 = new Coche("Honda", "Civic");
        Coche co3 = new Coche("Ford", "Mustang");

        co1.mostrarInformacion();
        co2.mostrarInformacion();
        co3.mostrarInformacion();

        Coche.mostrarTotalCoches();
    }
}