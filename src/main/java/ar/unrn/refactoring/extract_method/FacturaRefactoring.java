package ar.unrn.refactoring.extract_method;

import java.util.List;

public class FacturaRefactoring {
    private String cliente;
    private List<Item> items;

    public FacturaRefactoring(String cliente, List<Item> items) {
        this.cliente = cliente;
        this.items = items;
    }

    /**
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

    public record Item(String nombre, double precio) {}
}
