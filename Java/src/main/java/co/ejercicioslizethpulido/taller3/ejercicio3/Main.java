package co.ejercicioslizethpulido.taller3.ejercicio3;

public class Main {
    public static void main(String[] args) {
        CuentaDeAhorros cuenta1 = new CuentaDeAhorros("Maria Lozano", 100000d, 6745349023L);
        CuentaDeAhorros cuenta2 = new CuentaDeAhorros("Juan Rodriguez", 250000d, 8795049381L);
        CuentaCorriente cuenta3 = new CuentaCorriente("Apolo Garcia", 2300000d,48938402403L);
        cuenta1.depositar(20000d);
        cuenta1.retirar(50000d);
        cuenta1.transferirDinero(10000d,cuenta2);
        cuenta1.calcularInteres();
        cuenta1.verInformacionCuenta();
        cuenta2.verInformacionCuenta();
        cuenta3.verInformacionCuenta();
        cuenta3.generarCheque(155000d);

    }
}
