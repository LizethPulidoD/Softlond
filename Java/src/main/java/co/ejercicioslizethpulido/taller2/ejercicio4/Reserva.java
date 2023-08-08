package co.ejercicioslizethpulido.taller2.ejercicio4;

public class Reserva {
    private int numeroDeReserva;
    private Cliente cliente;
    private Habitacion habitacion;

    public Reserva(int numeroDeReserva, Cliente cliente, Habitacion habitacion) {
        this.numeroDeReserva = numeroDeReserva;
        this.cliente = cliente;
        this.habitacion = habitacion;
    }

    public Reserva() {
    }

    public int getNumeroDeReserva() {
        return numeroDeReserva;
    }

    public void setNumeroDeReserva(int numeroDeReserva) {
        this.numeroDeReserva = numeroDeReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String toString() {
        return "------------------------Reserva número:" + Math.abs(numeroDeReserva) + "-------------------------\n" +
                "Nombre del cliente: " + cliente.getNombre() + "\n" +
                "Cedula del cliente: " + cliente.getCedula() + "\n" +
                "Numero de la habitacion: " + habitacion.getNumero() + "\n" +
                "-------------------------------------------------------------------------\n";
    }
}
