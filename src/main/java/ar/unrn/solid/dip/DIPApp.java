package ar.unrn.solid.dip;

/**
 * Aplicación de demostración para el Principio de Inversión de Dependencias (DIP).
 * Muestra cómo un Interruptor puede controlar cualquier Dispositivo sin conocer
 * su tipo concreto.
 */
public class DIPApp {
    /**
     * Punto de entrada de la aplicación.
     *
     * @param args argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        System.out.println("--- DIP: Dependency Inversion Principle ---");

        Dispositivo lampara = new Lampara();
        Interruptor interruptorLampara = new Interruptor(lampara);
        interruptorLampara.operar();

        Dispositivo ventilador = new Ventilador();
        Interruptor interruptorVentilador = new Interruptor(ventilador);
        interruptorVentilador.operar();
    }
}
