package co.ejercicioslizethpulido.taller2.ejercicio2;

import co.ejercicioslizethpulido.taller2.ejercicio2.moneda.*;

public class Main {
    public static void main(String[] args) {
        Dolar dolar = new Dolar(1);
        Euro euro = new Euro(1.10);
        DolarAustraliano dolarAustraliano = new DolarAustraliano(0.66);
        PesoColombiano pesoColombiano = new PesoColombiano(0.00025);
        DolarCanadiense dolarCanadiense = new DolarCanadiense(0.75);
        LibraEsterlina libraEsterlina = new LibraEsterlina(1.28);
        PesoMexicano pesoMexicano = new PesoMexicano(0.059);
        Yen yen = new Yen(0.0070);
        System.out.println("El cambio de 1000 pesos colombianos a dolar canadiense equivale a " + ConversorMonedas.convertirMoneda(pesoColombiano, dolarCanadiense, 1000));
        System.out.println("El cambio de 200 dolares australianos a dolar equivale a " + ConversorMonedas.convertirMoneda(dolarAustraliano, dolar, 200));
        System.out.println("El cambio de 5000 pesos mexicanos a euro equivale a " + ConversorMonedas.convertirMoneda(pesoMexicano, euro, 5000));
        System.out.println("El cambio de 100 libras esterlinas a yen equivale a " + ConversorMonedas.convertirMoneda(libraEsterlina, yen, 100));
    }
}
