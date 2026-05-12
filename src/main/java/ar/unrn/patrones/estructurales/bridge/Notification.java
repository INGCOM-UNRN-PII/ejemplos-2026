package ar.unrn.patrones.estructurales.bridge;

/**
 * Representa la abstraccion del patron Bridge y concentra la idea de enviar una notificacion sin fijar todavia el canal concreto.
 * El paquete usa Bridge para separar la abstraccion de notificacion del mecanismo concreto con el que el mensaje se entrega.
 */
public abstract class Notification {
    protected MessageSender sender;

    public Notification(MessageSender sender) {
        this.sender = sender;
    }

    // El método que delega trabajo al implementador
    public abstract void send(String message);
}
