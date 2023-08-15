package co.ejercicioslizethpulido.taller3.ejercicio2;

public abstract class MensajeDeTexto implements Notificacion {
    protected String mensaje;
    protected String numeroDestino;

    protected MensajeDeTexto(String mensaje, String numeroDestino) {
        this.mensaje = mensaje;
        this.numeroDestino = numeroDestino;
    }
}
