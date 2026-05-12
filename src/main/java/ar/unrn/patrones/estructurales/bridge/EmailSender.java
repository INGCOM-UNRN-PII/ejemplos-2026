package ar.unrn.patrones.estructurales.bridge;

/**
 * Implementación concreta: Enviar por Email.
 */
public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando vía EMAIL: " + message);
    }
}
