package ar.unrn.patrones.creacionales.factory_method.avanzado;

/**
 * Producto Documento con metadatos.
 */
interface Documento {
    /** @return el tipo de documento. */
    String obtenerTipo();
    /** Realiza el guardado. */
    void guardar();
}

/** Documento PDF. */
class DocumentoPdf implements Documento {
    @Override public String obtenerTipo() { return "PDF"; }
    @Override public void guardar() { System.out.println("Generando estructura binaria PDF..."); }
}

/** Documento HTML. */
class DocumentoHtml implements Documento {
    @Override public String obtenerTipo() { return "HTML"; }
    @Override public void guardar() { System.out.println("Generando etiquetas <html>..."); }
}

/**
 * Gestor de Documentos avanzado que centraliza la creación.
 */
public abstract class GestorDocumentos {
    /**
     * Método fábrica abstracto.
     * @return un nuevo Documento.
     */
    public abstract Documento crearDocumento();

    /**
     * Proceso complejo de exportación.
     */
    public void exportar() {
        Documento doc = crearDocumento();
        System.out.println("Exportando documento tipo: " + doc.obtenerTipo());
        doc.guardar();
        System.out.println("Exportación finalizada.");
    }
}
