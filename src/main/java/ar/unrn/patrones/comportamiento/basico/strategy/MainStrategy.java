package ar.unrn.patrones.comportamiento.basico.strategy;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el cambio de algoritmo sin reescribir la calculadora.
 * El paquete usa Strategy para reemplazar condicionales por objetos que encapsulan cada operacion.
 */
public class MainStrategy {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(new SumaStrategy());

        System.out.println("--- Nivel básico: Strategy ---");
        System.out.println("4 + 6 = " + calculadora.resolver(4, 6));

        calculadora.setOperacion(new MultiplicacionStrategy());
        System.out.println("4 * 6 = " + calculadora.resolver(4, 6));
    }
}
