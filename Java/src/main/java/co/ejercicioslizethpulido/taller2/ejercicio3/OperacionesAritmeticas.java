package co.ejercicioslizethpulido.taller2.ejercicio3;

import java.util.Optional;

public interface OperacionesAritmeticas {
    Double sumar(Double numero1, Double numero2);

    Double restar(Double numero1, Double numero2);

    Double multiplicar(Double numero1, Double numero2);

    Optional<Double> dividir(Double numero1, Double numero2);

}
