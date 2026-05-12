package ar.unrn.patrones.integracion.smarthome;

/**
 * Modela un observador concreto que traduce los eventos del hogar a notificaciones entendibles por un usuario final.
 * El paquete integra varios patrones en un mismo escenario de hogar inteligente para mostrar colaboracion entre dispositivos, observadores, mediadores y decoradores.
 */
public class MobileApp implements HomeObserver {
    private String userName;

    public MobileApp(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String event) {
        System.out.println("📱 [App de " + userName + "] Notificación recibida: " + event);
    }
}
