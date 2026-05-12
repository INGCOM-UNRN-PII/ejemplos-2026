package ar.unrn.patrones.integracion.smarthome;

/**
 * Define las operaciones externas que pueden recorrerse sobre cada dispositivo sin mezclar esos algoritmos con la clase del dispositivo.
 * El paquete integra varios patrones en un mismo escenario de hogar inteligente para mostrar colaboracion entre dispositivos, observadores, mediadores y decoradores.
 */
public interface DeviceVisitor {
    void visit(SmartLight light);
    void visit(SmartThermostat thermostat);
}
