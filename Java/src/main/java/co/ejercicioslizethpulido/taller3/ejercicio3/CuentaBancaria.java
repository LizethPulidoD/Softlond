package co.ejercicioslizethpulido.taller3.ejercicio3;

public abstract class CuentaBancaria implements Cuenta{

    Double saldoCuenta;
    String nombreTitular;
    Long numeroCuenta;

    protected CuentaBancaria(String nombreTitular, Double saldoCuenta, Long numeroCuenta){
        this.nombreTitular=nombreTitular;
        this.saldoCuenta=saldoCuenta;
        this.numeroCuenta=numeroCuenta;
    }
    public void verInformacionCuenta(){
        System.out.printf("El titular es: %s%nEl numero de cuenta es: %d%nEl saldo de su cuenta es: %.2f%n%n",nombreTitular,numeroCuenta,saldoCuenta);
    }

    public void transferirDinero (Double valorTransferencia, Cuenta cuentaDestino){
        if (valorTransferencia<=saldoCuenta){
            saldoCuenta-=valorTransferencia;
            cuentaDestino.depositar(valorTransferencia);
        }else {
            System.out.println("No tiene fondos suficientes para la transaccion");
        }

    }
}
