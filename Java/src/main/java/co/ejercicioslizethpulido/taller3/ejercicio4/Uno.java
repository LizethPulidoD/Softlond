package co.ejercicioslizethpulido.taller3.ejercicio4;

public class Uno implements Carta {
    private final int numero;
    private final String color;


    public Uno(int numero, String color) {
        this.numero = numero;
        this.color = color;
    }

    @Override
    public void mostrarCarta() {
        System.out.printf("Esta es una carta de UNO, su valor numerico es %d y su color es %s%n", this.numero, this.color);
    }

    @Override
    public int valorNumerico() {
        return this.numero;
    }
}
