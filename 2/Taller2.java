import java.util.*;

public class Taller2{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Producto que desea comprar: ");
        System.out.println("Digite el nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.println("Digite el precio del producto: ");
        String precio = sc.nextLine();

        Producto miProducto = new Producto(nombre, precio);
        
        System.out.println("Estudiante que desea agregar: ");
        System.out.println("Digite el nombre del Estudiante: ");
        String nombreE = sc.nextLine();

        System.out.println("Digite la edad del Estudiante: ");
        int edad = sc.nextInt();

        Estudiante miEstudiante = new Estudiante(nombreE, edad);

        System.out.println("\nDatos del producto:");
        miProducto.mostrarProducto();

        System.out.println("\nDatos del estudiante:");
        System.out.println("Nombre: " + miEstudiante.nombreE);
        System.out.println("edad: " + miEstudiante.edad);
    }
}