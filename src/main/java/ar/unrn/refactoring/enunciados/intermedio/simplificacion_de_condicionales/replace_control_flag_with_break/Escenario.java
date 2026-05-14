    package ar.unrn.refactoring.enunciados.intermedio.simplificacion_de_condicionales.replace_control_flag_with_break;

    import java.util.List;

/**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class BuscadorReserva {
    public boolean contieneInactivo(List<Boolean> estados) {
        boolean encontrado = false;
        for (Boolean estado : estados) {
            if (!encontrado && !estado) {
                encontrado = true;
            }
        }
        return encontrado;
    }
}
