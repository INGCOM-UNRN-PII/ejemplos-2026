package ar.unrn.patrones.estructurales.bridge;

/**
 * Especializa la abstraccion para mensajes urgentes y demuestra que el nivel de urgencia puede variar sin tocar el canal de entrega.
 * El paquete usa Bridge para separar la abstraccion de notificacion del mecanismo concreto con el que el mensaje se entrega.
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
