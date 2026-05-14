    package ar.unrn.refactoring.enunciados.avanzado.composicion_de_funciones.slide_statements;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class EnvioCorreoPaciente {
    public void enviar(Paciente dato) {
        String email = dato.email();
        registrarAuditoria();
        if (dato.activo()) {
            System.out.println("Enviando a " + email);
        }
    }

    private void registrarAuditoria() {
        System.out.println("Auditoria registrada");
    }
}

record Paciente(String email, boolean activo) {
}
