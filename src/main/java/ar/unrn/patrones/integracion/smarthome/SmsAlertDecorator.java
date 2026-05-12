package ar.unrn.patrones.integracion.smarthome;

public class SmsAlertDecorator extends AlertDecorator {
    public SmsAlertDecorator(HomeAlert wrappedAlert) {
        super(wrappedAlert);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("📱 Enviando SMS con alerta: " + message);
    }
}
