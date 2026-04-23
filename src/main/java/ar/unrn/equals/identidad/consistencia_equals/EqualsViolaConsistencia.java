package ar.unrn.equals.identidad.consistencia_equals;
public class EqualsViolaConsistencia {
    @SuppressWarnings("EqualsIncompatibleType")
    public static void main(String[] args) {
        System.out.println("--- Problema: Violación de Consistencia ---");
        ObjetoAleatorio obj = new ObjetoAleatorio();
        System.out.println("Llamada 1: " + obj.equals("test"));
        System.out.println("Llamada 2: " + obj.equals("test"));
    }
}
