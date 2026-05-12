package ar.unrn.patrones.integracion.smarthome;

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
