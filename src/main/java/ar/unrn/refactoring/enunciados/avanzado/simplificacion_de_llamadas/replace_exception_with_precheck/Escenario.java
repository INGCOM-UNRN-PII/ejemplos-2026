    package ar.unrn.refactoring.enunciados.avanzado.simplificacion_de_llamadas.replace_exception_with_precheck;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class ProcesadorAlta {
    public boolean procesar(Cama helper, int cantidad) {
        try {
            helper.reservar(cantidad);
            return true;
        } catch (IllegalStateException ex) {
            return false;
        }
    }
}

class Cama {
    private int disponible = 1;

    public void reservar(int cantidad) {
        if (cantidad > disponible) {
            throw new IllegalStateException("No disponible");
        }
        disponible -= cantidad;
    }
}
