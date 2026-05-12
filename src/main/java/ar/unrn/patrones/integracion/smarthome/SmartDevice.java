package ar.unrn.patrones.integracion.smarthome;

/**
 * Provee la base comun para los dispositivos inteligentes y centraliza la relacion con el mediador que coordina el resto del ecosistema.
 * El paquete integra varios patrones en un mismo escenario de hogar inteligente para mostrar colaboracion entre dispositivos, observadores, mediadores y decoradores.
 */
public abstract class SmartDevice {
    protected HomeMediator mediator;

    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
    }

    // Parte del patrón Visitor
    public abstract void accept(DeviceVisitor visitor);
}
