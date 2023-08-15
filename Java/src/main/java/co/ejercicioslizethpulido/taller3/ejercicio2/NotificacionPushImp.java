package co.ejercicioslizethpulido.taller3.ejercicio2;

public class NotificacionPushImp extends NotificacionPush {

    protected NotificacionPushImp(String mensaje, String dispositivo) {
        super(mensaje, dispositivo);
    }

    @Override
    public void enviar() {
        System.out.printf("Para: %s%nMensaje: %s%n", dispositivo, mensaje);
    }
}
