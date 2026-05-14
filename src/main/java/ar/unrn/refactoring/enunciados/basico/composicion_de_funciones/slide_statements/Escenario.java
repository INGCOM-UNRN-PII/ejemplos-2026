    package ar.unrn.refactoring.enunciados.basico.composicion_de_funciones.slide_statements;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class EnvioCorreoPedido {
    public void enviar(Pedido dato) {
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

record Pedido(String email, boolean activo) {
}
