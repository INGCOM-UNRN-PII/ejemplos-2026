package ar.unrn.dos.lista;

import java.util.List;

/**
 * Aplicación de consola para demostrar el uso de la clase Red y sus
 * operaciones con listas.
 */
public class RedApp {

    static void main() {
        Red miRed = new Red();

        System.out.println("1. Estado inicial de la red:");
        System.out.println("   - ¿Está vacía? " + miRed.estaVacia());
        System.out.println("   - Cantidad de nodos: " + miRed.obtenerCantidadDeNodos());

        System.out.println("\n2. Agregando nodos...");
        miRed.agregarAlFinal("Nodo A");
        miRed.agregarAlFinal("Nodo C");
        miRed.agregarAlPrincipio("Nodo B"); // Se inserta en la posición 0

        System.out.println("   - Cantidad de nodos ahora: " + miRed.obtenerCantidadDeNodos());
        System.out.println("   - Primer nodo en la lista: " + miRed.obtenerPrimerNodo());

        System.out.println("\n3. Obteniendo una copia inmutable de los nodos:");
        List<String> copiaNodos = miRed.obtenerNodosInmutables();
        System.out.println("   - Contenido de la copia: " + copiaNodos);
        
        try {
            // Intentar modificar la copia inmutable lanzará una excepción
            copiaNodos.add("Nodo D");
        } catch (UnsupportedOperationException e) {
            System.out.println("   - ¡Correcto! No se puede modificar la copia creada con List.copyOf().");
        }

        System.out.println("\n4. Demostración de ConcurrentModificationException:");
        miRed.intentarModificarIterando();

        System.out.println("\n5. Removiendo y vaciando la red:");
        String nodoRemovido = miRed.removerPrimerNodo();
        System.out.println("   - Nodo removido del principio: " + nodoRemovido);
        System.out.println("   - Cantidad de nodos restantes: " + miRed.obtenerCantidadDeNodos());
        
        miRed.vaciarRed();
        System.out.println("   - Red después de vaciarla. ¿Está vacía? " + miRed.estaVacia());
    }
}
