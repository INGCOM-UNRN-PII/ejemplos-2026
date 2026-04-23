package ar.unrn.generados.objetos.internas;
public class ClasesInternas {
    private String nombreExterno = "Clase Externa";
    public static void main(String[] args) {
        ClasesInternas externa = new ClasesInternas();
        Interna objetoInterno = new Interna(externa.nombreExterno);
        objetoInterno.mostrar();
        EstaticaInterna objetoEstatico = new EstaticaInterna();
        objetoEstatico.mostrar();
    }
}
