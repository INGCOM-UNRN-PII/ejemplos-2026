package ar.unrn.patrones.estructurales.bridge;

/**
 * La clase "Abstracción".
 * Mantiene una referencia al implementador (el "Bridge" o Puente).
 */
public abstract class Notification {
    protected MessageSender sender;

    public Notification(MessageSender sender) {
        this.sender = sender;
    }

    // El método que delega trabajo al implementador
    public abstract void send(String message);
}
