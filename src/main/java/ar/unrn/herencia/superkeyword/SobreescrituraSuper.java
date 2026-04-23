package ar.unrn.herencia.superkeyword;
public class SobreescrituraSuper {
    public static void main(String[] args) {
        System.out.println("--- Sobreescritura con super ---");
        Documento doc = new DocumentoConLog();
        doc.escribir("Hola");
        doc.imprimir();
    }
}
