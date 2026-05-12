package ar.unrn.herencia.superkeyword;

/**
 * Amplia el procesamiento del documento agregando trazas y muestra un uso de super para extender, no reemplazar ciegamente, la logica base.
 * El paquete usa super dentro de metodos sobrescritos para extender comportamiento existente sin duplicar la implementacion base.
 */
public class DocumentoConLog extends Documento {
    @Override
    public void escribir(String texto) {
        super.escribir(texto);
        System.out.println("[LOG] Se escribió: " + texto);
    }
}
