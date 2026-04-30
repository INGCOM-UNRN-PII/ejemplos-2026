package ar.unrn.smells.acoplamiento;

/**
 * Aplicación de demostración para el olor de diseño: Acoplamiento.
 */
public class AcoplamientoApp {
    /**
     * Punto de entrada de la aplicación.
     * 
     * @param args argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        System.out.println("--- Smell: Acoplamiento ---");
        ProcesadorPedido p = new ProcesadorPedido();
        p.procesar("Notebook");

        Auto miAuto = new Auto();
        miAuto.temperaturaAgua = 100;
        new Motor().chequear(miAuto);
        System.out.println("Ventilador: " + miAuto.ventiladorEncendido);
    }
}
