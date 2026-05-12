package ar.unrn.patrones.estructurales.bridge;

/**
 * Representa el lado implementador del Bridge y abstrae el canal real con el que un mensaje termina saliendo del sistema.
 * El paquete usa Bridge para separar la abstraccion de notificacion del mecanismo concreto con el que el mensaje se entrega.
 */
public interface MessageSender {
    void sendMessage(String message);
}
