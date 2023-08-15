package co.ejercicioslizethpulido.taller3.ejercicio2;

public class CorreoElectronicoImp extends CorreoElectronico {
    protected CorreoElectronicoImp(String mensaje, String correoElectronicoDestino) {
        super(mensaje, correoElectronicoDestino);
    }

    @Override
    public void enviar() {
        System.out.printf("Para: %s%nMensaje: %s%n", correoElectronicoDestino, mensaje);
    }
}
