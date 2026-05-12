package ar.unrn.patrones.integracion.smarthome;

/**
 * Implementa la alerta mas simple del sistema y funciona como punto de partida sobre el que se apilan decoradores.
 * El paquete integra varios patrones en un mismo escenario de hogar inteligente para mostrar colaboracion entre dispositivos, observadores, mediadores y decoradores.
 */
public class BasicAlert implements HomeAlert {
    @Override
    public void send(String message) {
        System.out.println("⚠️ ALERTA BÁSICA EN PANTALLA DEL HUB: " + message);
    }
}
