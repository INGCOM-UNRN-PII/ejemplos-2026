package ar.unrn.patrones.estructurales.bridge;

/**
 * Implementa el lado concreto del Bridge para mostrar como el mismo mensaje puede enviarse por correo sin alterar la abstraccion.
 * El paquete usa Bridge para separar la abstraccion de notificacion del mecanismo concreto con el que el mensaje se entrega.
 */
public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando vía EMAIL: " + message);
    }
}
