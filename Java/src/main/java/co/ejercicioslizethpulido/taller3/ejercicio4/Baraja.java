package co.ejercicioslizethpulido.taller3.ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
    private List<Carta> cartas = new ArrayList<>();

    public void agregarCarta(Carta carta) {
        this.cartas.add(carta);
    }

    public void barajarCarta() {
        Collections.shuffle(cartas);
    }

    public List<Carta> getBaraja() {
        return cartas;
    }
}
