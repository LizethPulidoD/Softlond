package co.ejercicioslizethpulido.taller3.ejercicio2;

public abstract class NotificacionPush implements Notificacion {
    protected String mensaje;
    protected String dispositivo;

    protected NotificacionPush(String mensaje, String dispositivo) {
        this.mensaje = mensaje;
        this.dispositivo = dispositivo;
    }
}
