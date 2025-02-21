public class Persona {
    public void presentarse() {
        System.out.println("La persona se presenta.");
    }
}

class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("El estudiante se presenta.");
    }
}
class Profesor extends Persona {
    @Override
    public void presentarse() {
        System.out.println("El profesor se presenta.");
    }
}

class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        Profesor profesor = new Profesor();
        Persona persona = new Persona();
        
        estudiante.presentarse();
        profesor.presentarse();
        persona.presentarse();
    }
}