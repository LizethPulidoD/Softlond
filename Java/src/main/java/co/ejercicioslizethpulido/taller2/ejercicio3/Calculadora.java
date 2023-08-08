package co.ejercicioslizethpulido.taller2.ejercicio3;

import java.util.Optional;

public class Calculadora implements OperacionesAritmeticas {
    public Double sumar(Double numero1, Double numero2) {
        return numero1 + numero2;
    }

    public Double restar(Double numero1, Double numero2) {
        return numero1 - numero2;
    }

    public Double multiplicar(Double numero1, Double numero2) {
        return numero1 * numero2;
    }

    public Optional<Double> dividir(Double numero1, Double numero2) {
        if (numero2 == 0) {
            return Optional.empty();
        } else {
            return Optional.of(numero1 / numero2);
        }
    }
}
