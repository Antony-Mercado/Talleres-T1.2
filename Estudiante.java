public class Estudiante {
    
    String nombre;
    String edad;
    String curso;

    public Estudiante(String nombre){
        this.nombre = nombre;
        

    }

    public Estudiante(String nombre, String edad, String curso){
        this(nombre);
        this.edad = edad;
        this.curso = curso;
    }
}
