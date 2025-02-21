package vehiculo;

class Vehiculo{
    String tipo;

    class Moto{

    }
}

package paqueteb;

import vehiculo.Vehiculo.Moto;

public class main{
    public static void main(String[] args){
        Vehiculo v = Vehiculo("Toyota");
    }
}