package herenciasimple;

public class Empleado {
 protected String nombre;
 protected double salario;
 public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }
}
class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); 
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); 
        System.out.println("Departamento: " + departamento);
    }
}
 class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jose", 3000);
        
        Gerente gerente1 = new Gerente("Santiago", 5000, "Ventas");

         System.out.println("Detalles del Empleado:");
        empleado1.mostrarDetalles();

        System.out.println("\nDetalles del Gerente:");
        gerente1.mostrarDetalles();
    }
}