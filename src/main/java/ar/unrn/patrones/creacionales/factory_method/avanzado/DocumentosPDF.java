package ar.unrn.patrones.creacionales.factory_method.avanzado;

public class DocumentosPDF extends GestorDocumentos{

    @Override
    public Documento crearDocumento() {
        return new DocumentoPdf();
    }
}
