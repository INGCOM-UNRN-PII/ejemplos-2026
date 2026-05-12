package ar.unrn.patrones.estructurales.bridge;

/**
 * Especializa la abstraccion de notificacion para el caso comun, delegando el envio real en el implementador del puente.
 * El paquete usa Bridge para separar la abstraccion de notificacion del mecanismo concreto con el que el mensaje se entrega.
 */
public class NormalNotification extends Notification {

    public NormalNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void send(String message) {
        // Prepara el mensaje y luego usa el 'puente' para enviarlo
        String formattedMessage = "[Normal] " + message;
        sender.sendMessage(formattedMessage);
    }
}
