package co.ejercicioslizethpulido.taller3.ejercicio3;

public interface Cuenta {
    Double depositar (Double cantidadDinero);
    Double retirar (Double cantidadDinero);
    void verInformacionCuenta();
    void transferirDinero (Double valorTransferencia, Cuenta cuentaDestino);
}
