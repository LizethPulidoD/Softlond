package co.ejercicioslizethpulido.taller2.ejercicio4;

import java.util.*;

public class SistemaDeReservas {
    List<Hotel> hoteles;

    public SistemaDeReservas() {
        this.hoteles = inicializarHoteles();
    }

    public void crearReserva(String nombreDelaEmpresa) {
        Cliente cliente = ingresarCliente(nombreDelaEmpresa);
        Hotel hotel = seleccionarHotel();
        Habitacion habitacion = seleccionarHabitacionDeHotel(hotel);
        Reserva reserva = new Reserva((int) (System.currentTimeMillis()), cliente, habitacion);
        habitacion.ocuparHabitacion();
        hotel.agregarReserva(reserva);
        System.out.println("\nReserva realizada con éxito, datos de la reserva:");
        System.out.println(reserva);
    }

    private Cliente ingresarCliente(String nombreDelaEmpresa) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Digite la cedula: ");
        int cedula = scanner.nextInt();
        return new Cliente(cedula, nombre, nombreDelaEmpresa);
    }

    private Hotel seleccionarHotel() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nIngrese el número del hotel al cual desea hospedar al cliente: ");
            mostrarHoteles();
            int numeroHotel = scanner.nextInt() - 1;
            Hotel hotelSeleccionado = this.hoteles.get(numeroHotel);
            if (!hotelSeleccionado.getHabitaciones().isEmpty()) {
                return hotelSeleccionado;
            } else {
                System.out.println("El hotel no tiene habitaciones disponibles...");
            }
        }
    }

    private Habitacion seleccionarHabitacionDeHotel(Hotel hotel) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            hotel.listarHabitacionesDisponibles();
            System.out.print("\nIngrese el numero de la habitacion que desea reservar: ");
            int numeroDeHabitacion = scanner.nextInt();
            Optional<Habitacion> habitacion = hotel.obtenerHabitacionPorNumero(numeroDeHabitacion);
            if (habitacion.isPresent()) {
                return habitacion.get();
            } else {
                System.out.println("\nLa habitacion no esta disponible o no existe, por favor verifique.");
            }
        }
    }

    public void imprimirReservasPorHotel() {
        for (Hotel hotel : this.hoteles) {
            hotel.imprimirReservas();
        }
    }

    public void eliminarReserva() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del hotel: ");
        String nombreDelHotel = scanner.nextLine();
        System.out.print("\nIngrese la cedula del cliente: ");
        int cedulaDelCliente = scanner.nextInt();
        Optional<Hotel> hotel = buscarHotelPorNombre(nombreDelHotel);
        if (hotel.isPresent()) {
            Optional<Reserva> reserva = buscarReservaDeCliente(cedulaDelCliente, hotel.get());
            reserva.ifPresentOrElse(
                    reservaEncontrada -> {
                        hotel.get().getReservas().remove(reservaEncontrada);
                        System.out.println("\nReserva eliminada correctamente.");
                    }, () -> System.out.println("\nNo se encontró la reserva para el cliente en este hotel.")
            );
        } else {
            System.out.println("\nEl hotel no fue encontrado");
        }
    }

    private Optional<Reserva> buscarReservaDeCliente(int cedulaDelCliente, Hotel hotel) {
        for (Reserva reserva : hotel.getReservas()) {
            if (reserva.getCliente().getCedula() == cedulaDelCliente) {
                return Optional.of(reserva);
            }
        }
        return Optional.empty();
    }

    private Optional<Hotel> buscarHotelPorNombre(String nombre) {
        for (Hotel hotel : this.hoteles) {
            if (hotel.getNombre().equals(nombre)) {
                return Optional.of(hotel);
            }
        }
        return Optional.empty();
    }

    private List<Hotel> inicializarHoteles() {
        List<Hotel> hotelesAleatorios = new ArrayList<>();
        hotelesAleatorios.add(new Hotel("Hotel Estelar Parque De La 93", inicializarHabitacionesAleatorias()));
        hotelesAleatorios.add(new Hotel("Hotel B3 Virrey", inicializarHabitacionesAleatorias()));
        hotelesAleatorios.add(new Hotel("Hotel Tequendama", inicializarHabitacionesAleatorias()));
        hotelesAleatorios.add(new Hotel("Hotel Teusaquillo", inicializarHabitacionesAleatorias()));
        hotelesAleatorios.add(new Hotel("Hotel Dann Carlton Bogota", inicializarHabitacionesAleatorias()));
        return hotelesAleatorios;
    }

    private List<Habitacion> inicializarHabitacionesAleatorias() {
        List<Habitacion> habitaciones = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= random.nextInt(50) + 1; i++) {
            habitaciones.add(new Habitacion(i, true));
        }
        return habitaciones;
    }

    private void mostrarHoteles() {
        for (int i = 0; i < this.hoteles.size(); i++) {
            System.out.println((i + 1) + "." + this.hoteles.get(i).getNombre());
        }
    }
}
