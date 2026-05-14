    package ar.unrn.refactoring.enunciados.intermedio.simplificacion_de_llamadas.introduce_parameter_object;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class BuscadorReservas {
    public void buscar(String inicio, String fin, String categoria, boolean incluirInactivos) {
        System.out.println(inicio + fin + categoria + incluirInactivos);
    }
}
