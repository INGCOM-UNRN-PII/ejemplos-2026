    package ar.unrn.refactoring.enunciados.avanzado.simplificacion_de_condicionales.introduce_special_case;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class RepositorioPacientes {
    public Paciente buscarPorId(String id) {
        if (id == null || id.isBlank()) {
            return null;
        }
        return new Paciente("Generico");
    }
}

record Paciente(String nombre) {
}
