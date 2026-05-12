package ar.unrn.equals.identidad.simetria;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete discute la simetria de equals dentro de una jerarquia, donde comparar en un sentido y en el inverso debe arrojar el mismo resultado.
 */
public class EqualsViolaSimetria {
    public static void main(String[] args) {
        System.out.println("--- Problema: Violación de Simetría ---");
        Persona p = new Persona("Juan");
        Empleado e = new Empleado("Juan", 100);
        System.out.println("p.equals(e): " + p.equals(e));
        System.out.println("e.equals(p): " + e.equals(p));
    }
}
