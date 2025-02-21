import java.util.*;

public class Taller1{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a crear una cuenta bancaria: ");
        System.out.println("Dijite el número de cuenta: ");
        String numeroCuenta = sc.nextLine();

        System.out.print("Digite el saldo inicial: ");
        double saldo = sc.nextDouble();
        sc.nextLine(); 
        
        System.out.print("Digite el tipo de cuenta (Ahorro/Corriente): ");
        String tipoCuenta = sc.nextLine();
        
        CuentaBancaria miCuenta = new CuentaBancaria(numeroCuenta, tipoCuenta);
        
        System.out.println("\nAhoracrear un estudiante");
        System.out.print("Digite el nombre del estudiante: ");
        String nombre = sc.nextLine();
        
        System.out.print("Digite la edad del estudiante: ");
        int edad = sc.nextInt();
        
        System.out.print("Digite el curso del estudiante: ");
        String curso = sc.nextLine();
        
        Estudiante miEstudiante = new Estudiante(nombre);
        
        System.out.println("\nPor último, vamos a crear un libro");
        System.out.print("Digite el título del libro: ");
        String titulo = sc.nextLine();
        
        System.out.print("Digite el autor del libro: ");
        String autor = sc.nextLine();
        
        System.out.print("Digite el número de páginas: ");
        String paginas = sc.nextLine();
        
        Libro miLibro = new Libro(autor, titulo, paginas);
        
     
        System.out.println("\n--- Datos de los objetos creados ---");
        System.out.println("\nDatos de la cuenta bancaria:");
        System.out.println(miCuenta.toString());
        
        System.out.println("\nDatos del estudiante:");
        System.out.println("Nombre: " + miEstudiante.nombre);
        System.out.println("Curso: " + miEstudiante.curso);
        
        System.out.println("\nDatos del libro:");
        miLibro.mostrarLibro();
        
  
        sc.close();
    }
}