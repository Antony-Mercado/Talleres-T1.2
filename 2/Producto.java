public class Producto{
    private String nombre;
    private String precio;

    public Producto(String nombre, String precio){
        this.nombre = nombre;
        this.precio = precio;

    }

    public void mostrarProducto() {
        System.out.println("Nombre: "+ nombre + "Precio: " + precio);
    }
}