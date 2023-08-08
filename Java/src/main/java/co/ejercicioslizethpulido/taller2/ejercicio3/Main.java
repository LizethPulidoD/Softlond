package co.ejercicioslizethpulido.taller2.ejercicio3;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Calculadora calculo = new Calculadora();
        Optional<Double> resultado = calculo.dividir(2d,0d);
        if (resultado.isPresent()){
            System.out.printf("El resultado es: %f%n",resultado.get());
        }else{
            System.out.println("La operacion no fue posible");
        }
        System.out.println(calculo.sumar(3d,4d));
        System.out.println(calculo.restar(123d,32d));
        System.out.println(calculo.multiplicar(234d,23d));
    }
}
