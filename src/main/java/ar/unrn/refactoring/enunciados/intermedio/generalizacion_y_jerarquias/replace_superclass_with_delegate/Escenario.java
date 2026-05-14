    package ar.unrn.refactoring.enunciados.intermedio.generalizacion_y_jerarquias.replace_superclass_with_delegate;

    import java.util.ArrayList;

/**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class PilaReservas extends ArrayList<String> {
    public void push(String valor) {
        add(valor);
    }

    public String pop() {
        return remove(size() - 1);
    }
}
