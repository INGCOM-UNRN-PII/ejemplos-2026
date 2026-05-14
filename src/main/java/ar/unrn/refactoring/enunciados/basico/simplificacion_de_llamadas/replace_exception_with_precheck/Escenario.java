    package ar.unrn.refactoring.enunciados.basico.simplificacion_de_llamadas.replace_exception_with_precheck;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class ProcesadorPago {
    public boolean procesar(Stock helper, int cantidad) {
        try {
            helper.reservar(cantidad);
            return true;
        } catch (IllegalStateException ex) {
            return false;
        }
    }
}

class Stock {
    private int disponible = 1;

    public void reservar(int cantidad) {
        if (cantidad > disponible) {
            throw new IllegalStateException("No disponible");
        }
        disponible -= cantidad;
    }
}
