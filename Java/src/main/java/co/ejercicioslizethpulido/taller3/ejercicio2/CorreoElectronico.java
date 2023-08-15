package co.ejercicioslizethpulido.taller3.ejercicio2;

public abstract class CorreoElectronico implements Notificacion {
    protected String mensaje;
    protected String correoElectronicoDestino;

    protected CorreoElectronico(String mensaje, String correoElectronicoDestino) {
        this.mensaje = mensaje;
        this.correoElectronicoDestino = correoElectronicoDestino;
    }
}
