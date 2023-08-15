package co.ejercicioslizethpulido.taller3.ejercicio10;

public class Main {
    public static void main(String[] args) {
        Dibujable[] figuras = {
                new Circulo(),
                new Rectangulo(),
                new Triangulo(),
                new Cuadrado()
        };

        for (Dibujable figura : figuras) {
            figura.dibujar();
        }
    }
}
