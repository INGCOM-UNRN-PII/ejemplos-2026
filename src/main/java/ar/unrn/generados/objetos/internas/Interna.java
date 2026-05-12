package ar.unrn.generados.objetos.internas;

/**
 * Representa una clase interna no estatica y sirve para explicar como accede al estado de la instancia que la contiene.
 * El paquete muestra distintas clases internas para explicar como cambia el acceso al contexto exterior segun la forma elegida.
 */
public class Interna {
    private final String nombreExterno;

    public Interna(String nombreExterno) {
        this.nombreExterno = nombreExterno;
    }

    public void mostrar() {
        System.out.println("Desde Interna: " + nombreExterno);
    }
}
