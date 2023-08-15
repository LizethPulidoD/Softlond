package co.ejercicioslizethpulido.taller3.ejercicio4;

public class Blackjack implements Carta {
    private final int numero;

    public Blackjack(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarCarta() {
        System.out.printf("Esta es una carta de tipo %s y su valor numerico es %d", "Blackjack", this.numero);

    }

    @Override
    public int valorNumerico() {
        return this.numero;
    }
}
