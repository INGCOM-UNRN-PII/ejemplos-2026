package ar.unrn.lista.red;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/**
 * Clase que representa una Red compuesta por Nodos, donde cada nodo está
 * representado de forma simplificada mediante una cadena de texto ({@code String}).
 * <p>
 * Esta clase sirve como ejemplo simple para ilustrar una relación de agregación
 * en programación orientada a objetos. Demuestra cómo una clase puede utilizar y
 * gestionar una colección interna ({@link java.util.List}) para almacenar y manipular
 * sus elementos, ocultando la implementación subyacente al usuario de la clase.
 * </p>
 *
 * @contract.invar nodos != null
 */
public class Red {

    /**
     * Relación de agregación: La Red "tiene" una colección de nodos.
     * Se utiliza la interfaz {@code List} para permitir flexibilidad en la
     * implementación concreta utilizada (en este caso, {@code ArrayList}).
     */
    private List<String> nodos;

    /**
     * Construye una nueva instancia vacía de {@code Red}.
     * Inicializa la estructura de datos interna utilizando un {@link ArrayList}.
     *
     * @contract.post nodos != null y nodos.isEmpty() == true
     */
    public Red() {
        this.nodos = new ArrayList<>();
    }

    /**
     * Agrega un nuevo nodo al final de la red.
     * Esta operación inserta el elemento en la última posición disponible de la lista.
     *
     * @param nodo El nodo (texto) a agregar.
     *
     * @contract.pre nodo != null
     * @contract.post nodos.size() == old(nodos.size()) + 1
     */
    public void agregarAlFinal(String nodo) {
        if (nodo == null) {
            throw new IllegalArgumentException("El nodo no puede ser nulo");
        }
        nodos.add(nodo);      // Inserción al final
    }

    /**
     * Inserta un nuevo nodo al principio de la red (posición 0).
     * Esta operación desplaza el elemento que actualmente está en esa posición
     * (si lo hay) y todos los elementos subsecuentes hacia la derecha.
     *
     * @param nodo El nodo (texto) a insertar al principio.
     *
     * @contract.pre nodo != null
     * @contract.post nodos.size() == old(nodos.size()) + 1
     * @contract.post nodos.get(0).equals(nodo)
     */
    public void agregarAlPrincipio(String nodo) {
        if (nodo == null) {
            throw new IllegalArgumentException("El nodo no puede ser nulo");
        }
        nodos.add(0, nodo);   // Inserción en posición específica, desplazando los demás elementos
    }

    /**
     * Remueve y devuelve el primer nodo de la red (el que está en la posición 0).
     * Todos los elementos subsecuentes se desplazan hacia la izquierda.
     *
     * @return El nodo removido, o {@code null} si la red está vacía.
     * @contract.post (old ( nodos.isEmpty ()) == true -> return == null) y (old(nodos.isEmpty()) == false -> nodos.size() == old(nodos.size()) - 1)
     */
    public String removerPrimerNodo() {
        if (!nodos.isEmpty()) {
            return nodos.remove(0); // Remoción por índice (devuelve el elemento removido)
        }
        return null;
    }

    /**
     * Elimina todos los nodos contenidos en la red, dejándola vacía.
     *
     * @contract.post nodos.isEmpty() == true
     */
    public void vaciarRed() {
        nodos.clear();        // Vaciado completo de la estructura
    }

    /**
     * Obtiene la cantidad actual de nodos presentes en la red.
     *
     * @return El número de nodos en la red.
     * @contract.post return >= 0
     */
    public int obtenerCantidadDeNodos() {
        int elementos = nodos.size(); // Cantidad de elementos
        return elementos;
    }

    /**
     * Verifica si la red carece de nodos.
     * Se prefiere el uso del método {@code isEmpty()} de la lista interna
     * sobre la comprobación {@code size() == 0} por ser más claro e intencional.
     *
     * @return {@code true} si la red no tiene nodos, {@code false} en caso contrario.
     * @contract.post return == (nodos.size() == 0)
     */
    public boolean estaVacia() {
        boolean sinNodos = nodos.isEmpty(); // Preferible sobre size() == 0 para mayor claridad y rendimiento
        return sinNodos;
    }

    /**
     * Obtiene el primer nodo de la red sin removerlo.
     * Esta operación es de tiempo constante O(1) dado que la implementación
     * subyacente es un {@code ArrayList}.
     *
     * @return El primer nodo de la red, o {@code null} si la red está vacía.
     * @contract.post return == (nodos.isEmpty() ? null : nodos.get(0))
     */
    public String obtenerPrimerNodo() {
        if (!nodos.isEmpty()) {
            String primerNodo = nodos.get(0);   // Acceso posicional: O(1) en ArrayList
            return primerNodo;
        }
        return null;
    }

    /**
     * Retorna una copia defensiva (inmutable) de los nodos actuales.
     * <p>
     * Esto evita que el estado interno de la red sea modificado accidentalmente o
     * de forma maliciosa desde el exterior. Cualquier intento de modificar la lista
     * devuelta lanzará una excepción {@link UnsupportedOperationException}.
     * </p>
     *
     * @return Una {@link List} inmutable que contiene los nodos actuales.
     * @contract.post return != null
     * @see List#copyOf(java.util.Collection)
     */
    public List<String> obtenerNodosInmutables() {
        // List.copyOf (introducido en Java 10) devuelve una lista inmutable
        return List.copyOf(nodos);
    }

    /**
     * Método ilustrativo que demuestra por qué no se puede modificar de manera directa
     * una colección mientras se está iterando sobre ella mediante un bucle {@code for-each}.
     * <p>
     * Al intentar remover un elemento de la lista interna mediante {@code nodos.remove(nodo)}
     * durante la iteración, el iterador interno de Java detectará que la lista ha sido
     * modificada estructuralmente y lanzará una {@link ConcurrentModificationException}.
     * </p>
     */
    public void intentarModificarIterando() {
        System.out.println("Intentando remover elementos mientras iteramos con un foreach...");
        try {
            for (String nodo : nodos) {
                System.out.println("- Visitando: " + nodo);
                // Si modificamos la colección durante una iteración "for-each",
                // el iterador detecta el cambio y lanza una excepción.
                //el analisis estático "Error Prone" lo bloquea
                // nodos.remove(nodo);
            }
        } catch (ConcurrentModificationException e) {
            System.err.println("¡Error capturado! Se lanzó ConcurrentModificationException");
            System.err.println("Motivo: No puedes llamar a nodos.remove(nodo) mientras el for-each está iterando.");
        }
    }
}
