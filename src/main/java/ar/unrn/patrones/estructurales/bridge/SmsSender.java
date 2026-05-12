package ar.unrn.patrones.estructurales.bridge;

/**
 * Implementación concreta: Enviar por SMS.
 */
public class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando vía SMS: " + message);
    }
}
