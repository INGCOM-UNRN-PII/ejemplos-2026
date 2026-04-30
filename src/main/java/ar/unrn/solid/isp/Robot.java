package ar.unrn.solid.isp;

/**
 * Representa a un robot que solo tiene la capacidad de trabajar.
 */
public class Robot implements Trabajador {
    /**
     * El robot realiza su trabajo incansablemente.
     */
    @Override
    public void trabajar() { System.out.println("Robot trabajando incansablemente"); }
}
