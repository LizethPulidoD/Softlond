package co.ejercicioslizethpulido.taller3.ejercicio3;

public class CuentaCorriente extends CuentaBancaria{
    protected CuentaCorriente(String nombreTitular, Double saldoCuenta, Long numeroCuenta) {
        super(nombreTitular, saldoCuenta, numeroCuenta);
    }

    @Override
    public Double depositar(Double cantidadDinero) {
        return saldoCuenta+=cantidadDinero;
    }

    @Override
    public Double retirar(Double cantidadDinero) {
        return saldoCuenta -= cantidadDinero;
    }

    public void generarCheque (Double cantidadDinero){
        System.out.printf("Su cheque ha sido generado por un valor de %.2f%n",cantidadDinero);
    }
}
