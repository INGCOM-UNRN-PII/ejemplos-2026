package ar.unrn.dos.mutable.arreglo;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete muestra mutabilidad sobre arreglos compartidos para que se vea como varias referencias observan el mismo estado subyacente.
 */
public class ArregloApp {

    /**
     * Punto de entrada de la aplicación.
     */
    static void main() {
        System.out.println("--- Demostración de falta de copia defensiva ---");

        // 1. Problema al construir: mutación externa del parámetro
        int[] datosIniciales = {1, 2, 3, 4, 5};
        Arreglo miArreglo = new Arreglo(datosIniciales);

        System.out.println("Estado inicial de miArreglo: " + miArreglo);

        // Alguien modifica el array original DESPUÉS de pasarlo al constructor
        datosIniciales[0] = 999;

        System.out.println("Modificamos el array 'datosIniciales' externamente: datosIniciales[0] = 999");
        System.out.println("Estado de miArreglo (¡se vio afectado!): " + miArreglo);
        System.out.println("--------------------------------------------------");

        // 2. Problema de diseño (si la clase tuviera un getter para el arreglo interno)
        // Como Arreglo no expone el array interno (solo tiene toString y obtener), 
        // el problema principal aquí reside en el constructor.

        // Pero supongamos que la clase confiaba en que sus datos eran inmutables 
        // a partir de su creación. Como no hizo copia defensiva, la encapsulación se rompió.

        System.out.println("Para solucionar esto, Arreglo debería hacer:");
        System.out.println("this.arreglo = Arrays.copyOf(arreglo, arreglo.length);");
        System.out.println("en su constructor.");
    }
}
