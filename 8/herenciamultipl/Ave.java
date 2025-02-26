package herenciamultipl;
public class Ave {
public interface Volador {
void volar();
    }
public interface Cantante {
 void cantar();
 }
public static class Pajaro implements Volador, Cantante {
  @Override
  public void volar() {
  System.out.println("El ave está volando.");
 }
  @Override
  public void cantar() {
 System.out.println("El Artista está cantando.");
 }
}
public static void main(String[] args) {
 Pajaro Paj = new Pajaro();
 Paj.volar();
 Paj.cantar();
 }
}