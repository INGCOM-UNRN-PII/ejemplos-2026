package ar.unrn.patrones.integracion.smarthome;

/**
 * Representa un dispositivo concreto del hogar cuyo comportamiento se integra al hub sin conocer a los demas participantes.
 * El paquete integra varios patrones en un mismo escenario de hogar inteligente para mostrar colaboracion entre dispositivos, observadores, mediadores y decoradores.
 */
public class SmartLight extends SmartDevice {
    private boolean encendida = false;

    public void encender() {
        this.encendida = true;
        if (mediator != null) {
            mediator.notificarEvento(this, "Luz encendida");
        }
    }

    public void apagar() {
        this.encendida = false;
        if (mediator != null) {
            mediator.notificarEvento(this, "Luz apagada");
        }
    }

    public boolean isEncendida() {
        return encendida;
    }

    @Override
    public void accept(DeviceVisitor visitor) {
        // TODO: Implementar double dispatch
    }
}
