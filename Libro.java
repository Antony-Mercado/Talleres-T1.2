
public class Libro {

    String titulo;
    String autor;
    String numeroPagina;

    public Libro(String titulo, String autor, String numeroPagina){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;

    }

    public Libro(){
        titulo = "Desconocido";
        autor = "Desconocido";
        numeroPagina = "Descnocido";
    }

    public void mostrarLibro() {
        System.out.println("El libro se llama: " + titulo + ", de: " + autor + " y tiene: " + numeroPagina + " páginas.");
     }
  
     public static void main (String[] args){
        Libro li1 = new Libro("Albert", "Montana", "234234");
        li1.mostrarLibro();  
     }

}