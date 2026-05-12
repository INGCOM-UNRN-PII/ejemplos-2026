package ar.unrn.herencia.superkeyword;

/**
 * Amplia el procesamiento del documento agregando cifrado y muestra como una subclase puede apoyarse en super para conservar el flujo original.
 * El paquete usa super dentro de metodos sobrescritos para extender comportamiento existente sin duplicar la implementacion base.
 */
public class DocumentoCifrado extends Documento {
    @Override
    public void escribir(String texto) {
        String cifrado = new StringBuilder(texto).reverse().toString();
        super.escribir(cifrado);
    }

    @Override
    public void imprimir() {
        System.out.print("[CIFRADO] ");
        super.imprimir();
    }
}
