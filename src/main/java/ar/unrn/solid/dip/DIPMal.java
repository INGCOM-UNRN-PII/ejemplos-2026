package ar.unrn.solid.dip;

/**
 * VIOLACIÓN DIP: El Interruptor depende directamente del Ventilador (clase concreta).
 * Si queremos usar el interruptor para una Lámpara, debemos modificar la clase.
 */
class InterruptorMal {
    private VentiladorMal ventilador;

    public InterruptorMal() {
        this.ventilador = new VentiladorMal(); // Acoplamiento fuerte
    }

    public void presionar() {
        ventilador.encender();
    }
}

class VentiladorMal {
    public void encender() {
        System.out.println("Ventilador encendido");
    }
}
