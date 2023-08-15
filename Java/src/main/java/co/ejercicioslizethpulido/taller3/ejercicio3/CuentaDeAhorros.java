package co.ejercicioslizethpulido.taller3.ejercicio3;

public class CuentaDeAhorros extends CuentaBancaria {

    private final Double interes = 0.002;
    protected CuentaDeAhorros(String nombreTitular, Double saldoCuenta, Long numeroCuenta) {
        super(nombreTitular, saldoCuenta, numeroCuenta);
    }

    @Override
    public Double depositar(Double cantidadDinero) {
        return saldoCuenta+=cantidadDinero;
    }

    @Override
    public Double retirar(Double cantidadDinero) {
        return saldoCuenta-=cantidadDinero;
    }

    public Double calcularInteres (){
        return saldoCuenta*interes;
    }
}
