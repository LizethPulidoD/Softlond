package co.ejercicioslizethpulido.taller3.ejercicio2;

public class MensajeDeTextoImp extends MensajeDeTexto {
    protected MensajeDeTextoImp(String mensaje, String numeroDestino) {
        super(mensaje, numeroDestino);
    }

    @Override
    public void enviar() {
        System.out.printf("Para: %s%nMensaje: %s%n", numeroDestino, mensaje);
    }
}
