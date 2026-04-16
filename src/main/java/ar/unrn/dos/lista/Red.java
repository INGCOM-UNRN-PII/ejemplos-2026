package ar.unrn.dos;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/**
 * Clase que representa una Red que contiene Nodos (representados como Strings).
 * Ejemplifica una relación de agregación en la que la clase utiliza una 
 * colección interna (List) para manejar sus elementos.
 */
public class Red {
    
    // Relación de agregación: La Red "tiene" una colección de nodos.
    private List<String> nodos;

    public Red() {
        // Inicialización de la estructura de datos
        this.nodos = new ArrayList<>();
    }

    public void agregarAlFinal(String nodo) {
        nodos.add(nodo);      // Inserción al final
    }

    public void agregarAlPrincipio(String nodo) {
        nodos.add(0, nodo);   // Inserción en posición específica, desplazando los demás elementos
    }

    public String removerPrimerNodo() {
        if (!nodos.isEmpty()) {
            return nodos.remove(0); // Remoción por índice (devuelve el elemento removido)
        }
        return null;
    }
    
    public void vaciarRed() {
        nodos.clear();        // Vaciado completo de la estructura
    }

    public int obtenerCantidadDeNodos() {
        int elementos = nodos.size(); // Cantidad de elementos
        return elementos;
    }

    public boolean estaVacia() {
        boolean sinNodos = nodos.isEmpty(); // Preferible sobre size() == 0 para mayor claridad y rendimiento
        return sinNodos;
    }

    public String obtenerPrimerNodo() {
        if (!nodos.isEmpty()) {
            String primerNodo = nodos.get(0);   // Acceso posicional: O(1) en ArrayList
            return primerNodo;
        }
        return null;
    }

    /**
     * Retorna una copia defensiva de los nodos actuales para evitar 
     * que el estado interno sea modificado desde afuera.
     */
    public List<String> obtenerNodosInmutables() {
        // List.copyOf (introducido en Java 10) devuelve una lista inmutable
        return List.copyOf(nodos);
    }
    
    /**
     * Método que demuestra por qué no se puede modificar una lista mientras 
     * se itera sobre ella con un foreach.
     */
    public void intentarModificarIterando() {
        System.out.println("Intentando remover elementos mientras iteramos con un foreach...");
        try {
            for (String nodo : nodos) {
                System.out.println("- Visitando: " + nodo);
                // Si modificamos la colección durante una iteración "for-each",
                // el iterador detecta el cambio y lanza una excepción.
                nodos.remove(nodo); 
            }
        } catch (ConcurrentModificationException e) {
            System.err.println("¡Error capturado! Se lanzó ConcurrentModificationException");
            System.err.println("Motivo: No puedes llamar a nodos.remove(nodo) mientras el for-each está iterando.");
        }
    }
}
