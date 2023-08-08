package co.ejercicioslizethpulido.taller2.ejercicio2.moneda;

public abstract class Moneda {
    private double tazaDeCambioEnDolares;

    public Moneda(double tazaDeCambioEnDolares) {
        this.tazaDeCambioEnDolares = tazaDeCambioEnDolares;
    }

    double convertirMoneda(Moneda monedaDestino, double cantidad) {
        return (this.tazaDeCambioEnDolares * cantidad) / monedaDestino.tazaDeCambioEnDolares;
    }
}
