package ar.unrn.patrones.integracion.smarthome;

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
