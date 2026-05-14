    package ar.unrn.refactoring.enunciados.basico.simplificacion_de_llamadas.replace_query_with_parameter;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class ConversorPrecios {
    private final ServicioCambio servicio = new ServicioCambio();

    public double convertir(double valor) {
        return valor * servicio.factorActual();
    }
}

class ServicioCambio {
    public double factorActual() {
        return 1.2;
    }
}
