package ar.unrn.patrones.integracion.smarthome;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Centraliza la coordinacion del escenario de hogar inteligente y concentra el flujo de eventos que conecta dispositivos, observadores y recorridos.
 * El paquete integra varios patrones en un mismo escenario de hogar inteligente para mostrar colaboracion entre dispositivos, observadores, mediadores y decoradores.
 */
public class SmartHomeHub implements HomeMediator {
    private final List<SmartDevice> dispositivos = new ArrayList<>();
    private final List<HomeObserver> observadores = new ArrayList<>();

    @Override
    public void registrarDispositivo(SmartDevice dispositivo) {
        if (dispositivo == null) {
            throw new IllegalArgumentException("El dispositivo no puede ser nulo");
        }
        dispositivo.setMediator(this);
        dispositivos.add(dispositivo);
    }

    @Override
    public void notificarEvento(SmartDevice origen, String evento) {
        if (origen == null) {
            throw new IllegalArgumentException("El origen no puede ser nulo");
        }
        if (evento == null || evento.isBlank()) {
            throw new IllegalArgumentException("El evento no puede ser nulo ni vacio");
        }
        notificarObservadores("[" + origen.getClass().getSimpleName() + "] " + evento);
    }

    public void agregarObservador(HomeObserver observador) {
        if (observador == null) {
            throw new IllegalArgumentException("El observador no puede ser nulo");
        }
        observadores.add(observador);
    }

    public void notificarObservadores(String evento) {
        for (HomeObserver observador : observadores) {
            observador.update(evento);
        }
    }

    public Iterator<SmartDevice> crearIterador() {
        return dispositivos.iterator();
    }
}
