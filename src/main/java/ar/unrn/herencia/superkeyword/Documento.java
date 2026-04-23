package ar.unrn.herencia.superkeyword;
public class Documento {
    protected String contenido = "";
    public void escribir(String texto) { this.contenido += texto; }
    public void imprimir() { System.out.println("Imprimiendo contenido: " + contenido); }
}
