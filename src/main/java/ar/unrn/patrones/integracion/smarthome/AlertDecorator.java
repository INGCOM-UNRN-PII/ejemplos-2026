package ar.unrn.patrones.integracion.smarthome;

/**
 * Actua como base del decorador de alertas y permite encadenar canales adicionales sin alterar la implementacion base del aviso.
 * El paquete integra varios patrones en un mismo escenario de hogar inteligente para mostrar colaboracion entre dispositivos, observadores, mediadores y decoradores.
 */
public abstract class AlertDecorator implements HomeAlert {
    protected HomeAlert wrappedAlert;

    public AlertDecorator(HomeAlert wrappedAlert) {
        this.wrappedAlert = wrappedAlert;
    }

    @Override
    public void send(String message) {
        wrappedAlert.send(message);
    }
}
