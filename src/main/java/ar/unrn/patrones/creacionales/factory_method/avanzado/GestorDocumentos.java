package ar.unrn.patrones.creacionales.factory_method.avanzado;

/**
 * Provee la implementacion base sobre la que las subclases extienden comportamiento reutilizando parte de la logica original.
 * El paquete usa Factory Method para delegar la creacion de documentos especializados segun el formato requerido.
 */
interface Documento {
    /** @return el tipo de documento. */
    String obtenerTipo();
    /** Realiza el guardado. */
    void guardar();
}

/**
 * Representa uno de los productos del ejemplo y deja que el metodo fabrica decida cuando y con que variante crearlo.
 * El paquete usa Factory Method para delegar la creacion de documentos especializados segun el formato requerido.
 */
class DocumentoPdf implements Documento {
    @Override public String obtenerTipo() { return "PDF"; }
    @Override public void guardar() { System.out.println("Generando estructura binaria PDF..."); }
}

/**
 * Representa uno de los productos del ejemplo y deja que el metodo fabrica decida cuando y con que variante crearlo.
 * El paquete usa Factory Method para delegar la creacion de documentos especializados segun el formato requerido.
 */
class DocumentoHtml implements Documento {
    @Override public String obtenerTipo() { return "HTML"; }
    @Override public void guardar() { System.out.println("Generando etiquetas <html>..."); }
}

/**
 * Provee una base comun que concentra lo compartido y deja a las subclases la responsabilidad de completar la parte variable del comportamiento.
 * El paquete usa Factory Method para delegar la creacion de documentos especializados segun el formato requerido.
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
