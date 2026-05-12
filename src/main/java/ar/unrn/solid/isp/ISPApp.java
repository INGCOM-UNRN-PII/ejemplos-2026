package ar.unrn.solid.isp;

/**
 * Aplicación de demostración para el Principio de Segregación de Interfaces (ISP).
 * Muestra cómo las interfaces pequeñas evitan obligar a las clases a implementar
 * métodos que no necesitan.
 */
public class ISPApp {
    /**
     * Punto de entrada de la aplicación.
     *
     * @param args argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        System.out.println("--- ISP: Interface Segregation Principle ---");

        Humano humano = new Humano();
        Robot robot = new Robot();

        humano.trabajar();
        humano.comer();

        robot.trabajar();
    }
}
