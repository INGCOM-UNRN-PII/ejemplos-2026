package ar.unrn.generados.patrones.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación del Patrón de Diseño: Visitor (Visitante).
 * <p>
 * Este patrón permite separar algoritmos de la estructura de objetos sobre
 * la que operan. Es muy útil cuando tenés una jerarquía de clases fija pero
 * querés agregar nuevas operaciones sin modificarlas.
 * <p>
 * Concepto clave: Doble Despacho (Double Dispatch).
 * Se delega la elección del método correcto en tiempo de ejecución.
 * <p>
 * Inspirado en el TP9.
 */

// 1. Interfaz que deben implementar todos los elementos visitables.
/**
 * Define el contrato minimo que las implementaciones del paquete deben cumplir para colaborar sin depender de detalles concretos.
 * El paquete implementa Visitor con fines didacticos para separar operaciones nuevas de una estructura de objetos estable.
 */
interface Elemento {
    void aceptar(Visitante v);
}

// 2. Interfaz que define las operaciones del visitante.
// Notá que hay un método por cada tipo concreto de elemento.
/**
 * Define el contrato minimo que las implementaciones del paquete deben cumplir para colaborar sin depender de detalles concretos.
 * El paquete implementa Visitor con fines didacticos para separar operaciones nuevas de una estructura de objetos estable.
 */
interface Visitante {
    void visitar(LibroVisitado l);

    void visitar(Electronico e);
}

/**
 * Representa un participante concreto del patron Visitor y muestra como se reparte la responsabilidad entre elementos y visitantes.
 * El paquete implementa Visitor con fines didacticos para separar operaciones nuevas de una estructura de objetos estable.
 */
class LibroVisitado implements Elemento {
    private String titulo;
    private double precio;

    public LibroVisitado(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public void aceptar(Visitante v) {
        // Aquí ocurre la "magia" del doble despacho: el objeto sabe qué
        // método de la interfaz visitante llamar sobre sí mismo.
        v.visitar(this);
    }
}

/**
 * Representa un participante concreto del patron Visitor y muestra como se reparte la responsabilidad entre elementos y visitantes.
 * El paquete implementa Visitor con fines didacticos para separar operaciones nuevas de una estructura de objetos estable.
 */
class Electronico implements Elemento {
    private String nombre;
    private double precioBase;

    public Electronico(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    @Override
    public void aceptar(Visitante v) {
        v.visitar(this);
    }
}

/**
 * Representa un participante concreto del patron Visitor y muestra como se reparte la responsabilidad entre elementos y visitantes.
 * El paquete implementa Visitor con fines didacticos para separar operaciones nuevas de una estructura de objetos estable.
 */
class CalculadorImpuestos implements Visitante {
    private double totalImpuestos = 0;

    @Override
    public void visitar(LibroVisitado l) {
        // Los libros están exentos (IVA 0%).
        System.out.println("Calculando impuesto para libro: " + l.getTitulo());
    }

    @Override
    public void visitar(Electronico e) {
        // Los electrónicos pagan un 21%.
        totalImpuestos += e.getPrecioBase() * 0.21;
        System.out.println("Calculando impuesto para electrónico. Agregado: " + (e.getPrecioBase() * 0.21));
    }

    public double getTotalImpuestos() {
        return totalImpuestos;
    }
}

/**
 * Ejecuta la demostracion del patron Visitor y muestra como agregar operaciones nuevas sin editar la estructura visitada.
 * El paquete implementa Visitor con fines didacticos para separar operaciones nuevas de una estructura de objetos estable.
 */
public class PatronVisitor {

    public static void main(String[] args) {
        System.out.println("--- Demostración del Patrón Visitor ---");

        List<Elemento> carrito = new ArrayList<>();
        carrito.add(new LibroVisitado("Java para Profesionales", 500.0));
        carrito.add(new Electronico("Auriculares BT", 1500.0));

        // Creamos una nueva operación sin cambiar las clases originales.
        CalculadorImpuestos miCalculador = new CalculadorImpuestos();

        for (Elemento e : carrito) {
            e.aceptar(miCalculador);
        }

        System.out.println("\nTotal Impuestos a recaudar: $" + miCalculador.getTotalImpuestos());

        // Reflexión Académica:
        // En C, para manejar diferentes tipos de una estructura, solés usar 
        // un "switch" gigante sobre un "enum tipo". Eso es frágil: si agregás
        // un tipo nuevo, tenés que buscar todos los switch de tu programa.
        // Con Visitor, el compilador te obliga a implementar el método 
        // correspondiente en cada visitante si agregás un nuevo tipo de Elemento.
    }
}
