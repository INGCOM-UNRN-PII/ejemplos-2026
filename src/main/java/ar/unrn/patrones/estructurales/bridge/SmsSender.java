package ar.unrn.patrones.estructurales.bridge;

/**
 * Implementa el lado concreto del Bridge para mostrar como el canal SMS puede intercambiarse sin reescribir la notificacion.
 * El paquete usa Bridge para separar la abstraccion de notificacion del mecanismo concreto con el que el mensaje se entrega.
 */
public class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando vía SMS: " + message);
    }
}
