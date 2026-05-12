package ar.unrn.patrones.estructurales.bridge;

/**
 * La interfaz "Implementador". 
 * Define las operaciones básicas que realizarán las plataformas de envío reales.
 */
public interface MessageSender {
    void sendMessage(String message);
}
