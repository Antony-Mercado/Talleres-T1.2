package herenciasimple;
 class Persona {
    protected String nombre;
    protected int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDetalles() {
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
    public void mostrarDetalles() {
        super.mostrarDetalles(); 
        System.out.println("Matrícula: " + matricula);
    }
}

 class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Santiago", 22, "E2024001");

        System.out.println("Detalles del Estudiante:");
        estudiante1.mostrarDetalles();
    }
}