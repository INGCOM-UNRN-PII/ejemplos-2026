package ar.unrn.generados.objetos.internas;

/**
 * Representa una clase interna estatica y muestra el caso en que se quiere agrupar colaboracion sin retener una instancia exterior.
 * El paquete muestra distintas clases internas para explicar como cambia el acceso al contexto exterior segun la forma elegida.
 */
public class EstaticaInterna {
    public void mostrar() {
        System.out.println("Desde Estática: No tengo acceso a 'nombreExterno' directamente.");
    }
}
