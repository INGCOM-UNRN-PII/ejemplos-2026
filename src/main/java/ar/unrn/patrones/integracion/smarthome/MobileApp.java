package ar.unrn.patrones.integracion.smarthome;

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
