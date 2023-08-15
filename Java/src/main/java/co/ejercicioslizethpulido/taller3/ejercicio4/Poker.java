package co.ejercicioslizethpulido.taller3.ejercicio4;

public class Poker implements Carta {
    private final int numero;
    private final String tipoDeCarta;

    public Poker(int numero, PalosDeCarta tipoDeCarta) {
        this.numero = numero;
        this.tipoDeCarta = tipoDeCarta.getNombre();
    }

    @Override
    public void mostrarCarta() {
        System.out.printf("Esta es una carta de %s con el número %d y figura de tipo %s%n", "Poker", this.numero, this.tipoDeCarta);
    }

    @Override
    public int valorNumerico() {
        return this.numero;
    }
}
