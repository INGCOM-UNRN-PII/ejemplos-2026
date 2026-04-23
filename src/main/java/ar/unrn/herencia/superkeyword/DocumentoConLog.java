package ar.unrn.herencia.superkeyword;
public class DocumentoConLog extends Documento {
    @Override
    public void escribir(String texto) {
        super.escribir(texto);
        System.out.println("[LOG] Se escribió: " + texto);
    }
}
