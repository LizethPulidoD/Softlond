package co.ejercicioslizethpulido.taller3.ejercicio4;

import java.util.Random;
import java.util.Scanner;

public class JuegoDeCartas {
    private Baraja baraja;

    public JuegoDeCartas(Baraja baraja) {
        this.baraja = baraja;
    }

    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        rellenarBarajaAleatoriamente();
        System.out.println("Bienvenido al juego adivinador de cartas.");
        System.out.println("La baraja de cartas ha sido rellenada aleatoriamente, adivine el número y descubrirá la carta y su tipo.");
        System.out.println("Escogiendo un número de carta aleatorio...");
        Carta cartaAleatoria = baraja.getBaraja().get(random.nextInt(51) + 1);
        boolean cartaEncontrada = false;
        while (!cartaEncontrada) {
            System.out.print("\nPor favor ingrese el número:");
            int numero = scanner.nextInt();
            if (numero == cartaAleatoria.valorNumerico()) {
                System.out.println("¡Encontraste la carta! la carta es...");
                cartaAleatoria.mostrarCarta();
                cartaEncontrada = true;
            } else {
                System.out.println("No encontraste la carta, intenta denuevo.");
            }
        }
    }

    private void rellenarBarajaAleatoriamente() {
        Random random = new Random();
        for (int i = 0; i < 17; i++) {
            baraja.agregarCarta(generarCartaAleatoriaDeBlackjack(random.nextInt(10) + 1));
        }
        for (int i = 0; i < 17; i++) {
            baraja.agregarCarta(generarCartaAleatoriaDeUno(random.nextInt(9)));
        }
        for (int i = 0; i < 16; i++) {
            baraja.agregarCarta(generarCartaAleatoriaDePoker(random.nextInt(9) + 1));
        }
        baraja.barajarCarta();
    }

    private Poker generarCartaAleatoriaDePoker(int numero) {
        return new Poker(numero, obtenerTipoDeCartaAletorio());
    }

    private Uno generarCartaAleatoriaDeUno(int numero) {
        return new Uno(numero, obtenerColorAleatorio());
    }

    private Blackjack generarCartaAleatoriaDeBlackjack(int numero) {
        return new Blackjack(numero);
    }

    private String obtenerColorAleatorio() {
        Random random = new Random();
        String[] nombresColores = {
                "Rojo", "Verde", "Azul", "Amarillo"
        };
        int indiceAleatorio = random.nextInt(nombresColores.length);
        return nombresColores[indiceAleatorio];
    }

    private PalosDeCarta obtenerTipoDeCartaAletorio() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(4) + 1;
        switch (numeroAleatorio) {
            case 1:
                return PalosDeCarta.PICAS;
            case 2:
                return PalosDeCarta.CORAZONES;
            case 3:
                return PalosDeCarta.ROMBOS;
            case 4:
                return PalosDeCarta.TREBOLES;
            default:
                return null;
        }
    }


}
