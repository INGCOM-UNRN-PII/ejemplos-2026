    package ar.unrn.refactoring.enunciados.intermedio.simplificacion_de_condicionales.introduce_special_case;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class RepositorioHuespedes {
    public Huesped buscarPorId(String id) {
        if (id == null || id.isBlank()) {
            return null;
        }
        return new Huesped("Generico");
    }
}

record Huesped(String nombre) {
}
