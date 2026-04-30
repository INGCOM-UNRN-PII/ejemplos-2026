package ar.unrn.solid.dip;

public class DIPApp {
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
