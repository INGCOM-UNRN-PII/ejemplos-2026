package ar.unrn.patrones.estructurales.bridge;

/**
 * Abstracción refinada: Notificación normal.
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
