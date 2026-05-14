package ar.unrn.refactoring.patrones_diseno.avanzado.estructurales.proxy;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde el cliente valida acceso y lee directo el expediente remoto.
 */
public class RepositorioExpedientes {
    public String abrir(String usuario, ExpedienteRemoto expediente) {
        if (!usuario.equals(expediente.propietario()) && !"auditor".equals(usuario)) {
            throw new IllegalArgumentException("Sin permisos");
        }
        System.out.println("Auditando acceso");
        return expediente.contenido();
    }
}

class ExpedienteRemoto {
    private final String propietario;

    ExpedienteRemoto(String propietario) {
        this.propietario = propietario;
    }

    public String propietario() { return propietario; }
    public String contenido() { return "Expediente remoto"; }
}
