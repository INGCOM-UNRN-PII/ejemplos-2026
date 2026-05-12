package ar.unrn.patrones.integracion.smarthome;

public class BasicAlert implements HomeAlert {
    @Override
    public void send(String message) {
        System.out.println("⚠️ ALERTA BÁSICA EN PANTALLA DEL HUB: " + message);
    }
}
