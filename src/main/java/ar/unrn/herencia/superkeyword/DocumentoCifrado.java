package ar.unrn.herencia.superkeyword;
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
