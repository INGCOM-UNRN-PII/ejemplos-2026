package ar.unrn.patrones.integracion.smarthome;

/**
 * Representa un dispositivo concreto del hogar orientado a temperatura y sirve para mostrar que el mediador puede coordinar tipos distintos.
 * El paquete integra varios patrones en un mismo escenario de hogar inteligente para mostrar colaboracion entre dispositivos, observadores, mediadores y decoradores.
 */
public class SmartThermostat extends SmartDevice {
    private int temperatura = 20;

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        if (mediator != null) {
            mediator.notificarEvento(this, "Temperatura cambiada a " + temperatura + "°C");
        }
    }

    public int getTemperatura() {
        return temperatura;
    }

    @Override
    public void accept(DeviceVisitor visitor) {
        visitor.visit(this);
    }
}
