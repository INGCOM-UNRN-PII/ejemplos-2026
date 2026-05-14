    package ar.unrn.refactoring.enunciados.intermedio.composicion_de_funciones.replace_inline_code_with_function_call;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class GestorHuespedes {
    public String telefonoPrincipal(String telefono) {
        return telefono.replace("-", "").replace(" ", "");
    }

    public String telefonoSecundario(String telefono) {
        return telefono.replace("-", "").replace(" ", "");
    }
}
