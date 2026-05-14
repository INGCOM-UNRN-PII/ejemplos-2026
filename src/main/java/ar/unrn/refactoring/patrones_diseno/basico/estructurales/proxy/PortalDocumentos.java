package ar.unrn.refactoring.patrones_diseno.basico.estructurales.proxy;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde el portal usa directamente un documento remoto costoso y sensible.
 */
public class PortalDocumentos {
    public String abrir(String usuario, DocumentoRemoto documento) {
        if (!usuario.equals(documento.propietario())) {
            throw new IllegalArgumentException("Acceso denegado");
        }
        return documento.contenido();
    }
}

class DocumentoRemoto {
    private final String propietario;

    DocumentoRemoto(String propietario) {
        this.propietario = propietario;
    }

    public String propietario() {
        return propietario;
    }

    public String contenido() {
        return "Contenido descargado";
    }
}
