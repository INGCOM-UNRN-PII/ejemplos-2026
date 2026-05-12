package ar.unrn.patrones.integracion.smarthome;

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
        // TODO: Implementar double dispatch
    }
}
