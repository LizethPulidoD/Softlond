package co.ejercicioslizethpulido.taller3.ejercicio7;

import co.ejercicioslizethpulido.taller3.ejercicio1.*;

public class Main {
    public static void main(String[] args) throws LadosIgualesException {
        Figura[] formas = new Figura[3];
        formas[0] = new Circulo(5);
        formas[1] = new Cuadrado(7);
        formas[2] = new Rectangulo(2,3);

        for (Figura forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
