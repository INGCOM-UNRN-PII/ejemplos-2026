package ar.unrn.equals.identidad.consistencia_equals;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete expone por que equals debe ser consistente entre invocaciones sucesivas mientras los objetos no cambian de estado relevante.
 */
public class EqualsViolaConsistencia {
    @SuppressWarnings("EqualsIncompatibleType")
    public static void main(String[] args) {
        System.out.println("--- Problema: Violación de Consistencia ---");
        ObjetoAleatorio obj = new ObjetoAleatorio();
        System.out.println("Llamada 1: " + obj.equals("test"));
        System.out.println("Llamada 2: " + obj.equals("test"));
    }
}
