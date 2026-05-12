package ar.unrn.herencia.superkeyword;

/**
 * Ejecuta el ejemplo del paquete para mostrar cuando conviene reutilizar una implementacion heredada y sumar comportamiento propio.
 * El paquete usa super dentro de metodos sobrescritos para extender comportamiento existente sin duplicar la implementacion base.
 */
public class SobreescrituraSuper {
    public static void main(String[] args) {
        System.out.println("--- Sobreescritura con super ---");
        Documento doc = new DocumentoConLog();
        doc.escribir("Hola");
        doc.imprimir();
    }
}
