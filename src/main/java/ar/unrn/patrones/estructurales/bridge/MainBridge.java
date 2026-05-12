package ar.unrn.patrones.estructurales.bridge;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete usa Bridge para separar la abstraccion de notificacion del mecanismo concreto con el que el mensaje se entrega.
 */
public class MainBridge {
    public static void main(String[] args) {
        // Creamos las implementaciones (los medios de envío)
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SmsSender();

        System.out.println("--- Notificaciones por Email ---");
        Notification normalEmail = new NormalNotification(emailSender);
        normalEmail.send("Bienvenido al sistema.");

        Notification urgentEmail = new UrgentNotification(emailSender);
        urgentEmail.send("Servidor caído.");

        System.out.println("\n--- Notificaciones por SMS ---");
        Notification normalSms = new NormalNotification(smsSender);
        normalSms.send("Tu código es 1234.");

        Notification urgentSms = new UrgentNotification(smsSender);
        urgentSms.send("Intento de acceso no autorizado.");
    }
}
