package co.ejercicioslizethpulido.taller3.ejercicio4;

public class Main {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        JuegoDeCartas juegoDeCartas = new JuegoDeCartas(baraja);
        juegoDeCartas.iniciarJuego();
    }
}
