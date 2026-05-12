package ar.unrn.patrones.integracion.smarthome;

public class EmailAlertDecorator extends AlertDecorator {
    public EmailAlertDecorator(HomeAlert wrappedAlert) {
        super(wrappedAlert);
    }
    // TODO: Implementar el envío de email
}
