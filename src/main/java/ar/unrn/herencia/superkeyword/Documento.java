package ar.unrn.herencia.superkeyword;

/**
 * Provee la implementacion base sobre la que las subclases extienden comportamiento reutilizando parte de la logica original.
 * El paquete usa super dentro de metodos sobrescritos para extender comportamiento existente sin duplicar la implementacion base.
 */
public class Documento {
    protected String contenido = "";

    public void escribir(String texto) {
        this.contenido += texto;
    }

    public void imprimir() {
        System.out.println("Imprimiendo contenido: " + contenido);
    }
}
