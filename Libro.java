
public class Libro {

    String titulo;
    String autor;
    int numeroPagina;

    public Libro(String titulo, String autor, int numeroPagina){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;

    }

    public Libro(){
        titulo = "Desconocido";
        autor = "Desconocido";
        numeroPagina = "Desconocido";
    }

}