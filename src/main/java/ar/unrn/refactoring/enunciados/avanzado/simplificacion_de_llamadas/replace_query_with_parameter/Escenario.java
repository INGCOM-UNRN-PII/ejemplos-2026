    package ar.unrn.refactoring.enunciados.avanzado.simplificacion_de_llamadas.replace_query_with_parameter;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class ConversorCobertura {
    private final ServicioAranceles servicio = new ServicioAranceles();

    public double convertir(double valor) {
        return valor * servicio.factorActual();
    }
}

class ServicioAranceles {
    public double factorActual() {
        return 1.2;
    }
}
