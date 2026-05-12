package ar.unrn.patrones.integracion.smarthome;

/**
 * Concentra una operacion transversal del sistema para recorrer dispositivos y calcular o reportar informacion energetica sin invadir sus clases.
 * El paquete integra varios patrones en un mismo escenario de hogar inteligente para mostrar colaboracion entre dispositivos, observadores, mediadores y decoradores.
 */
public class EnergyVisitor implements DeviceVisitor {
    // TODO: Implementar lógica de cálculo y sumar el consumo
    @Override
    public void visit(SmartLight light) {}

    @Override
    public void visit(SmartThermostat thermostat) {}
}
