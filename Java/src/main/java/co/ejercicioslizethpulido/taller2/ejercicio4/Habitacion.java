package co.ejercicioslizethpulido.taller2.ejercicio4;

public class Habitacion {
    private int numero;
    private boolean estaDisponible;

    public Habitacion(int numero, boolean estaDisponible) {
        this.numero = numero;
        this.estaDisponible = estaDisponible;
    }

    public Habitacion() {
    }

    public void ocuparHabitacion() {
        this.estaDisponible = false;
    }

    public void desocuparHabitacion() {
        this.estaDisponible = true;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }
}
