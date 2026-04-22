package ar.unrn.cuatro;

/**
 * Ejemplo que viola la propiedad REFLEXIVA del contrato de equals.
 * 
 * Contrato: x.equals(x) debe ser true
 * 
 * Problema: Esta implementación retorna false cuando se compara un objeto consigo mismo
 * si tiene un campo aleatorio o temporal.
 */
public class EqualsViolaReflexividad {
    private final String nombre;
    private final long timestamp; // Marca de tiempo que cambia en cada comparación

    public EqualsViolaReflexividad(String nombre) {
        this.nombre = nombre;
        this.timestamp = System.currentTimeMillis();
    }

    /**
     * IMPLEMENTACIÓN INCORRECTA: Viola reflexividad
     * Incluye timestamp en la comparación, que puede cambiar
     */
    @SuppressWarnings({"EqualsGetClass", "EqualsHashCode"})
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        EqualsViolaReflexividad otro = (EqualsViolaReflexividad) obj;
        
        // PROBLEMA: compara timestamp que puede ser diferente incluso para el mismo objeto
        // si se llama en diferentes momentos
        return nombre.equals(otro.nombre) && 
               timestamp == otro.timestamp &&
               System.currentTimeMillis() % 2 == 0; // Condición aleatoria que viola reflexividad
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    /**
     * Demuestra el problema de violar reflexividad.
     */
    @SuppressWarnings("SelfEquals")
    public static void main(String[] args) throws InterruptedException {
        EqualsViolaReflexividad obj = new EqualsViolaReflexividad("Test");
        
        // Primera comparación
        boolean resultado1 = obj.equals(obj);
        Thread.sleep(10); // Espera para cambiar el tiempo
        
        // Segunda comparación del mismo objeto consigo mismo
        boolean resultado2 = obj.equals(obj);
        
        System.out.println("Primera comparación obj.equals(obj): " + resultado1);
        System.out.println("Segunda comparación obj.equals(obj): " + resultado2);
        
        if (resultado1 != resultado2) {
            System.out.println("\n❌ PROBLEMA: Un objeto no es consistentemente igual a sí mismo");
            System.out.println("Esto viola la propiedad REFLEXIVA del contrato de equals");
        }
    }
}
