package ar.unrn.patrones.integracion.smarthome;

/**
 * Define el contrato minimo para cualquier canal de alerta del hogar, de modo que el resto del sistema pueda disparar avisos sin acoplarse a un medio concreto.
 * El paquete integra varios patrones en un mismo escenario de hogar inteligente para mostrar colaboracion entre dispositivos, observadores, mediadores y decoradores.
 */
public interface HomeAlert {
    void send(String message);
}
