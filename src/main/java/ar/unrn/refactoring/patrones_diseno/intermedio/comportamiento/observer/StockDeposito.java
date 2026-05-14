package ar.unrn.refactoring.patrones_diseno.intermedio.comportamiento.observer;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde el stock avisa manualmente a cada servicio interesado.
 */
public class StockDeposito {
    private final AlertaEmail email = new AlertaEmail();
    private final AlertaPantalla pantalla = new AlertaPantalla();

    public void actualizar(String producto, int cantidad) {
        if (cantidad < 5) {
            email.enviar(producto, cantidad);
            pantalla.mostrar(producto, cantidad);
        }
    }
}

class AlertaEmail {
    public void enviar(String producto, int cantidad) {
        System.out.println("Email: " + producto + " " + cantidad);
    }
}

class AlertaPantalla {
    public void mostrar(String producto, int cantidad) {
        System.out.println("Pantalla: " + producto + " " + cantidad);
    }
}
