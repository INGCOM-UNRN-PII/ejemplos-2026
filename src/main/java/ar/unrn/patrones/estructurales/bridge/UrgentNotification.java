package ar.unrn.patrones.estructurales.bridge;

/**
 * Abstracción refinada: Notificación urgente.
 */
public class UrgentNotification extends Notification {

    public UrgentNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void send(String message) {
        // Prepara el mensaje urgente y luego usa el 'puente' para enviarlo
        String formattedMessage = "[URGENTE!!!] " + message.toUpperCase();
        sender.sendMessage(formattedMessage);
    }
}
