package ar.unrn.patrones.integracion.smarthome;

/**
 * Declara el punto de coordinacion comun entre dispositivos para que colaboren a traves del hub y no mediante referencias directas entre si.
 * El paquete integra varios patrones en un mismo escenario de hogar inteligente para mostrar colaboracion entre dispositivos, observadores, mediadores y decoradores.
 */
public interface HomeMediator {
    void registrarDispositivo(SmartDevice dispositivo);

    void notificarEvento(SmartDevice origen, String evento);
}
