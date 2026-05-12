package ar.unrn.refactoring.parameter_object;

import java.time.LocalDate;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete concentra un ejercicio donde varios parametros relacionados se agrupan para expresar una sola idea de negocio.
 */
public class BusquedaApp {

    /**
     * Busca entradas en un rango de fechas y filtros específicos.
     * MÉTODO A REFACTORIZAR: Lista de parámetros larga y repetitiva.
     *
     * @param inicio           fecha inicial de búsqueda.
     * @param fin              fecha final de búsqueda.
     * @param categoria        categoría de los elementos.
     * @param incluirInactivos flag para incluir elementos inactivos.
     */
    public void buscarEntradas(LocalDate inicio, LocalDate fin, String categoria, boolean incluirInactivos) {
        System.out.println("Buscando entre " + inicio + " y " + fin);
        // ... lógica de búsqueda
    }

    /**
     * Genera un reporte basado en un rango de fechas para un usuario.
     *
     * @param inicio  fecha inicial del reporte.
     * @param fin     fecha final del reporte.
     * @param usuario nombre del usuario solicitante.
     */
    public void generarReporte(LocalDate inicio, LocalDate fin, String usuario) {
        System.out.println("Reporte desde " + inicio + " hasta " + fin);
        // ... lógica de reporte
    }
}
