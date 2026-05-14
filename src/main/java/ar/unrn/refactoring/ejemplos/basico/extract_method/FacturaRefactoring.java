package ar.unrn.refactoring.ejemplos.basico.extract_method;

import java.util.List;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde un metodo grande se divide en pasos con nombre para volver explicita la intencion del codigo.
 */
public class FacturaRefactoring {
    private String cliente;
    private List<Item> items;

    /**
     * Crea una nueva instancia de FacturaRefactoring.
     *
     * @param cliente el nombre del cliente.
     * @param items   la lista de ítems de la factura.
     */
    public FacturaRefactoring(String cliente, List<Item> items) {
        this.cliente = cliente;
        this.items = items;
    }

    /**
     * Imprime el detalle de la factura.
     * MÉTODO A REFACTORIZAR: Es demasiado largo y mezcla niveles de abstracción.
     */
    public void imprimirDetalle() {
        // 1. Imprimir Cabecera
        System.out.println("*****************************");
        System.out.println("****   DETALLE FACTURA   ****");
        System.out.println("*****************************");
        System.out.println("Cliente: " + cliente);

        // 2. Calcular Total e Imprimir Items
        double total = 0;
        for (Item item : items) {
            total += item.precio();
            System.out.println("- " + item.nombre() + ": $" + item.precio());
        }

        // 3. Imprimir Pie
        System.out.println("-----------------------------");
        System.out.println("TOTAL: $" + total);
        System.out.println("*****************************");
    }

    /**
     * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
     * El paquete concentra un ejercicio donde un metodo grande se divide en pasos con nombre para volver explicita la intencion del codigo.
     */
    public record Item(String nombre, double precio) {
    }
}
