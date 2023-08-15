package co.ejercicioslizethpulido.taller3.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<InstrumentoMusical> instrumentosMusicales = obtenerListaDeInstrumentos();
        for (InstrumentoMusical instrumentoMusical : instrumentosMusicales) {
            instrumentoMusical.tocar();
        }
    }

    private static List<InstrumentoMusical> obtenerListaDeInstrumentos() {
        List<InstrumentoMusical> instrumentosMusicales = new ArrayList<>();
        instrumentosMusicales.add(new Flauta());
        instrumentosMusicales.add(new Piano());
        instrumentosMusicales.add(new Violin());
        instrumentosMusicales.add(new Chelo());
        instrumentosMusicales.add(new Guitarra());
        return instrumentosMusicales;
    }
}
