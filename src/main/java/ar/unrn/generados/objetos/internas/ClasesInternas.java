package ar.unrn.generados.objetos.internas;

/**
 * Actua como clase anfitriona para mostrar cuando conviene definir comportamiento estrechamente ligado a una instancia exterior.
 * El paquete muestra distintas clases internas para explicar como cambia el acceso al contexto exterior segun la forma elegida.
 */
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
