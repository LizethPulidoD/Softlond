package co.ejercicioslizethpulido.taller3.ejercicio1;

public class Cuadrado implements Figura {
    private final double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }


    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 4 *lado;
    }
}
