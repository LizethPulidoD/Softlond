package co.ejercicioslizethpulido.taller3.ejercicio1;

public class Rectangulo implements Figura {
    private final double ladoA;
    private final double ladoB;

    public Rectangulo(double ladoA, double ladoB) throws LadosIgualesException {
        if (ladoA == ladoB) {
            throw new LadosIgualesException("Los lados del rectángulo no pueden ser iguales");
        }
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea() {
        return ladoA * ladoB;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (ladoA + ladoB);
    }
}
