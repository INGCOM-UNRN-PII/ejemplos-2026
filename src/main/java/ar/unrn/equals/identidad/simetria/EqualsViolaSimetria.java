package ar.unrn.equals.identidad.simetria;
public class EqualsViolaSimetria {
    public static void main(String[] args) {
        System.out.println("--- Problema: Violación de Simetría ---");
        Persona p = new Persona("Juan");
        Empleado e = new Empleado("Juan", 100);
        System.out.println("p.equals(e): " + p.equals(e));
        System.out.println("e.equals(p): " + e.equals(p));
    }
}
