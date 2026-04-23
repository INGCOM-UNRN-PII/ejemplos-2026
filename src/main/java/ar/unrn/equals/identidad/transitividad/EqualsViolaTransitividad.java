package ar.unrn.equals.identidad.transitividad;
public class EqualsViolaTransitividad {
    public static void main(String[] args) {
        System.out.println("--- Problema: Violación de Transitividad ---");
        PuntoConTolerancia p1 = new PuntoConTolerancia(1, 1);
        PuntoConTolerancia p2 = new PuntoConTolerancia(2, 2);
        PuntoConTolerancia p3 = new PuntoConTolerancia(3, 3);
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p2.equals(p3): " + p2.equals(p3));
        System.out.println("p1.equals(p3): " + p1.equals(p3));
    }
}
