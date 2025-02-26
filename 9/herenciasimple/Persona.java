package herenciasimple;

public class Persona {
protected String nombre;
protected int edad;

public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
 }
    public void mostrarInfo() {
 System.out.println("Nombre: " + nombre);
 System.out.println("Edad: " + edad + " años");
   }
}
class Estudiante extends Persona {
private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
super(nombre, edad);
this.matricula = matricula;
}
    @Override
public void mostrarInfo() {
super.mostrarInfo();
 System.out.println("Matrícula: " + matricula);
    }
}
class PruebaPersona {
public static void main(String[] args) {
 Persona persona1 = new Persona("Albert", 19);
 System.out.println("Detalles de la Persona:");
 persona1.mostrarInfo();

Estudiante estudiante1 = new Estudiante("Santiago", 20, "A12345");
System.out.println("Detalles del Estudiante:");
estudiante1.mostrarInfo();
    }
}