package ar.unrn.solid.isp;

/**
 * Representa un cliente o implementacion concreta del ejemplo y deja ver que conjunto minimo de operaciones necesita de verdad.
 * El paquete usa estos tipos para mostrar que una interfaz debe exponer solo las operaciones que cada cliente realmente necesita.
 */
public class Robot implements Trabajador {
    /**
     * El robot realiza su trabajo incansablemente.
     */
    @Override
    public void trabajar() {
        System.out.println("Robot trabajando incansablemente");
    }
}
