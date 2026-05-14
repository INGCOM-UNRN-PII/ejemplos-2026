    package ar.unrn.refactoring.enunciados.avanzado.composicion_de_funciones.substitute_algorithm;

    import java.util.List;

/**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class BuscadorPaciente {
    public boolean contiene(List<String> valores, String buscado) {
        for (String actual : valores) {
            if (actual.equals(buscado)) {
                return true;
            }
        }
        return false;
    }
}
