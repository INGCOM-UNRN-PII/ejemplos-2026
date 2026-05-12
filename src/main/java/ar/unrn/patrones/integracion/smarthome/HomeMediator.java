package ar.unrn.patrones.integracion.smarthome;

public interface HomeMediator {
    void registrarDispositivo(SmartDevice dispositivo);
    void notificarEvento(SmartDevice origen, String evento);
}
