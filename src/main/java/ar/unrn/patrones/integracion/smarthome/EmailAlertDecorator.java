package ar.unrn.patrones.integracion.smarthome;

/**
 * Envuelve a otro colaborador del mismo contrato para agregar comportamiento sin romper la interfaz que el cliente ya conoce.
 * El paquete integra varios patrones en un mismo escenario de hogar inteligente para mostrar colaboracion entre dispositivos, observadores, mediadores y decoradores.
 */
public class EmailAlertDecorator extends AlertDecorator {
    public EmailAlertDecorator(HomeAlert wrappedAlert) {
        super(wrappedAlert);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("📧 Enviando email con alerta: " + message);
    }
}
