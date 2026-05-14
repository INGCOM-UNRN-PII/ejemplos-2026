    package ar.unrn.refactoring.enunciados.intermedio.simplificacion_de_llamadas.replace_query_with_parameter;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class ConversorTarifas {
    private final ServicioTemporada servicio = new ServicioTemporada();

    public double convertir(double valor) {
        return valor * servicio.factorActual();
    }
}

class ServicioTemporada {
    public double factorActual() {
        return 1.2;
    }
}
