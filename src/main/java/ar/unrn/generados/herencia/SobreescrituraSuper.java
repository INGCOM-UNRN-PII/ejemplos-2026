package ar.unrn.generados.herencia;

/**
 * Ejemplo de sobreescritura que aprovecha la implementación del padre.
 */
public class SobreescrituraSuper {

    static class Documento {
        protected String contenido = "";

        public void escribir(String texto) {
            this.contenido += texto;
        }

        public void imprimir() {
            System.out.println("Imprimiendo contenido: " + contenido);
        }
    }

    /**
     * Este hijo aprovecha la implementación del padre pero le agrega 
     * comportamiento extra (logging).
     */
    static class DocumentoConLog extends Documento {
        @Override
        public void escribir(String texto) {
            // Aprovecha TODO el comportamiento del padre
            super.escribir(texto);
            // Agrega comportamiento propio
            System.out.println("[LOG] Se escribió: " + texto);
        }
    }

    /**
     * Este hijo aprovecha "partes" de la implementación del padre.
     * Reusa el método imprimir() pero redefine cómo se escribe.
     */
    static class DocumentoCifrado extends Documento {
        @Override
        public void escribir(String texto) {
            // No usa super.escribir() directamente, sino que 
            // altera el dato antes de usar la lógica del padre.
            String cifrado = new StringBuilder(texto).reverse().toString();
            super.escribir(cifrado);
        }
        
        @Override
        public void imprimir() {
            System.out.print("[CIFRADO] ");
            // Aprovecha la lógica de impresión del padre
            super.imprimir();
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Sobreescritura con super ---");
        
        Documento doc = new DocumentoConLog();
        doc.escribir("Hola");
        doc.imprimir();

        System.out.println("\n--- Sobreescritura parcial/modificada ---");
        Documento cifrado = new DocumentoCifrado();
        cifrado.escribir("Mensaje Secreto");
        cifrado.imprimir();
    }
}
