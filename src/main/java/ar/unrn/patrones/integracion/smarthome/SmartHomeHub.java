package ar.unrn.patrones.integracion.smarthome;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Centraliza la coordinacion del escenario de hogar inteligente y concentra el flujo de eventos que conecta dispositivos, observadores y recorridos.
 * El paquete integra varios patrones en un mismo escenario de hogar inteligente para mostrar colaboracion entre dispositivos, observadores, mediadores y decoradores.
 */
public class SmartHomeHub implements HomeMediator {
    private List<SmartDevice> dispositivos = new ArrayList<>();
    private List<HomeObserver> observadores = new ArrayList<>();

    // TODO: Implementar Mediator (registrarDispositivo, notificarEvento)

    // TODO: Implementar Observer methods (agregarObservador, notificarObservadores)

    // TODO: Implementar Iterator method (crearIterador)
}
