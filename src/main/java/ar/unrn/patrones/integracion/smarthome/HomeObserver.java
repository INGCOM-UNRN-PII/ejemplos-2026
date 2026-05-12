package ar.unrn.patrones.integracion.smarthome;

/**
 * Define el contrato de los observadores que reciben eventos del hogar cuando el hub decide propagar un cambio relevante.
 * El paquete integra varios patrones en un mismo escenario de hogar inteligente para mostrar colaboracion entre dispositivos, observadores, mediadores y decoradores.
 */
public interface HomeObserver {
    void update(String event);
}
