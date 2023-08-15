package co.ejercicioslizethpulido.taller3.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Notificacion correoElectronico = new CorreoElectronicoImp("Cordial saludo", "lpulidod@hotmail.com");
        Notificacion mensajeDeTexto = new MensajeDeTextoImp("Hola!", "314558576");
        Notificacion notificacionPush = new NotificacionPushImp("Nueva actualizacion ", "Celular");

        correoElectronico.enviar();
        mensajeDeTexto.enviar();
        notificacionPush.enviar();
    }
}
