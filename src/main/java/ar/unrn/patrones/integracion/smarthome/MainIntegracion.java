package ar.unrn.patrones.integracion.smarthome;

import java.util.Iterator;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete integra varios patrones en un mismo escenario de hogar inteligente para mostrar colaboracion entre dispositivos, observadores, mediadores y decoradores.
 */
public class MainIntegracion {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();
        hub.agregarObservador(new MobileApp("Ana"));

        SmartLight luz = new SmartLight();
        SmartThermostat termostato = new SmartThermostat();

        hub.registrarDispositivo(luz);
        hub.registrarDispositivo(termostato);

        luz.encender();
        termostato.setTemperatura(24);

        EnergyVisitor visitor = new EnergyVisitor();
        Iterator<SmartDevice> iterador = hub.crearIterador();
        while (iterador.hasNext()) {
            iterador.next().accept(visitor);
        }

        HomeAlert alertas = new SmsAlertDecorator(new EmailAlertDecorator(new BasicAlert()));
        alertas.send("Consumo estimado actual: " + visitor.getConsumoTotal() + " kWh");
    }
}
