package ar.unrn.refactoring.patrones_diseno.avanzado.comportamiento.mediator;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde los controles de un formulario se coordinan de manera directa.
 */
public class FormularioReserva {
    public void seleccionarHabitacion(CampoFechas fechas, CampoPrecio precio, String habitacion) {
        if ("suite".equals(habitacion)) {
            precio.actualizar(500);
            fechas.marcarPremium();
        } else {
            precio.actualizar(200);
            fechas.marcarComun();
        }
    }
}

class CampoFechas {
    public void marcarPremium() { System.out.println("Calendario premium"); }
    public void marcarComun() { System.out.println("Calendario comun"); }
}

class CampoPrecio {
    public void actualizar(double precio) { System.out.println("Precio: " + precio); }
}
