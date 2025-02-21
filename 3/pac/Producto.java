public class Producto{
    String nombre;
    double precio;
    String stock;

   Producto(String nombre, double precio, String stock){
       this.nombre = nombre;
       this.precio = precio;
       this.stock = stock;

   }

   void mostrarProducto(){
       System.out.println("Nombre: "+ nombre + " Precio: "+ precio + " Stock: "+ stock);
   }

}