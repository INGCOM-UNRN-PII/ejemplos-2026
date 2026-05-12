package ar.unrn.patrones.integracion.smarthome;

public interface DeviceVisitor {
    void visit(SmartLight light);
    void visit(SmartThermostat thermostat);
}
