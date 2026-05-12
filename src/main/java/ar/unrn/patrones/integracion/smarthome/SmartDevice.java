package ar.unrn.patrones.integracion.smarthome;

public abstract class SmartDevice {
    protected HomeMediator mediator;

    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
    }

    // Parte del patrón Visitor
    public abstract void accept(DeviceVisitor visitor);
}
