package ar.unrn.patrones.integracion.smarthome;

public class EnergyVisitor implements DeviceVisitor {
    // TODO: Implementar lógica de cálculo y sumar el consumo
    @Override
    public void visit(SmartLight light) {}

    @Override
    public void visit(SmartThermostat thermostat) {}
}
