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

/**
 * Representa una variante deliberadamente defectuosa que sirve para exponer el problema de diseno que el paquete esta discutiendo.
 * El paquete explica el principio de inversion de dependencias separando las politicas de alto nivel de los detalles concretos que realizan el trabajo.
 */
class VentiladorMal {
    public void encender() {
        System.out.println("Ventilador encendido");
    }
}
