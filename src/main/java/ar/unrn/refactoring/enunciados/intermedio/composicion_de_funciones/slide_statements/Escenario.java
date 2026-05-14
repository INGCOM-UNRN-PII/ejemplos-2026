    package ar.unrn.refactoring.enunciados.intermedio.composicion_de_funciones.slide_statements;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class EnvioCorreoReserva {
    public void enviar(Reserva dato) {
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

record Reserva(String email, boolean activo) {
}
