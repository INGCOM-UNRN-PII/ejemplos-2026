package ar.unrn.refactoring.parameter_object;

import java.time.LocalDate;

public class BusquedaApp {

    /**
     * MÉTODO A REFACTORIZAR: Lista de parámetros larga y repetitiva.
     */
    public void buscarEntradas(LocalDate inicio, LocalDate fin, String categoria, boolean incluirInactivos) {
        System.out.println("Buscando entre " + inicio + " y " + fin);
        // ... lógica de búsqueda
    }

    public void generarReporte(LocalDate inicio, LocalDate fin, String usuario) {
        System.out.println("Reporte desde " + inicio + " hasta " + fin);
        // ... lógica de reporte
    }
}
