package co.ejercicioslizethpulido.taller2.ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaDeReservas sistemaDeReservas = new SistemaDeReservas();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la empresa: ");
        String nombreDeLaEmpresa = scanner.nextLine();
        boolean continuar=true;
        while (continuar) {
            System.out.println("\nBienvenido, ¿Que acción desea realizar?\n1.Reservar\n2.Cancelar reserva\n3.Salir");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    sistemaDeReservas.crearReserva(nombreDeLaEmpresa);
                    break;
                case 2:
                    sistemaDeReservas.eliminarReserva();
                    break;
                case 3:
                    continuar=false;
                    break;
            }
        }
        System.out.println("---------------------------------------------------------");
        System.out.printf("Empresa que reservo : %s%n",nombreDeLaEmpresa);
        System.out.println("---------------------------------------------------------");
        System.out.println("Resevas por hotel:\n");
        sistemaDeReservas.imprimirReservasPorHotel();
    }
}
