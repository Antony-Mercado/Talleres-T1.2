public class CuentaBancaria {
    
    String numeroCuenta;
    String saldo;
    String tipoCuenta;

    public CuentaBancaria(){

        numeroCuenta = "Desconocido";
        saldo = "0.0";
        tipoCuenta = "Ahorro";
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria(String numeroCuenta,String saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public String toString(){
        return "Cuenta " + numeroCuenta + " - Tipo: " + tipoCuenta + " - Saldo: $" + saldo;
        
    }
}
