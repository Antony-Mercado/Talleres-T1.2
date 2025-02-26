package herenciamultipl;
public interface Nadador {
void nadar();
}
interface Respirador{
void respirar();
}
 class Pez implements Nadador, Respirador{
@Override
public void nadar(){
System.out.println("El pescao esta nadando");

}
@Override 
public void respirar(){
System.out.println("El nadador esta respirando");
}
public static void main (String[] args){
  Pez pescao = new Pez();
  pescao.nadar();
  pescao.respirar();
 }
} 
