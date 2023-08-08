package co.ejercicioslizethpulido.taller2.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Hotel {
    private List<Habitacion> habitaciones = new ArrayList<>();
    private String nombre;
    private List<Reserva> reservas;


    public Hotel(String nombre, List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
        this.nombre = nombre;
        this.reservas = new ArrayList<>();
    }

    public Hotel() {
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void agregarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public void imprimirReservas() {
        if (!this.reservas.isEmpty()) {
            System.out.println(this.getNombre());
            System.out.println(this.reservas);
        }
    }

    public void listarHabitacionesDisponibles() {
        System.out.println("\nLos siguientes numeros de habitaciones se encuentran disponibles: ");
        for (Habitacion habitacion : this.getHabitaciones()) {
            if (habitacion.isEstaDisponible()) {
                System.out.printf("%d ", habitacion.getNumero());
            }
        }
    }

    public Optional<Habitacion> obtenerHabitacionPorNumero(int numero) {
        for (Habitacion habitacion : this.habitaciones) {
            if (habitacion.getNumero() == numero) {
                return Optional.of(habitacion);
            }
        }
        return Optional.empty();
    }

}
