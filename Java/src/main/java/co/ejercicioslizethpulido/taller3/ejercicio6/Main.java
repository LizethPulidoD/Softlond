package co.ejercicioslizethpulido.taller3.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animales = obtenerListaDeAnimales();
        for (Animal animal : animales) {
            animal.hacerSonido();
        }

    }

    private static List<Animal> obtenerListaDeAnimales() {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gallo());
        animales.add(new Gato());
        animales.add(new Rana());
        animales.add(new Vaca());
        animales.add(new Serpiente());
        animales.add(new Cabra());
        return animales;
    }
}
